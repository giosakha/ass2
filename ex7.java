package ass2;

import java.util.*;
/*Write a java program to convert the postfix express to infix expression using
Stack (Algorithm is given below)*/
public class ex7 {
    public static void main(String[] args) {
        PostfixExpression postfix = new PostfixExpression("abc-+de-fg-h+/*");
        System.out.println("Postfix: " + postfix);
        System.out.println("Infix: " + postfix.toInfix());
    }
}

class Expression {
    public String value;

    public Expression(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return value;
    }
}

class PostfixExpression {
    private Stack<Expression> stack;

    public PostfixExpression(String postfix) {
        stack = new Stack<>();
        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);
            if (Character.isAlphabetic(c)) {
                stack.push(new Expression(String.valueOf(c)));
            } else {
                Expression b = stack.pop();
                Expression a = stack.pop();
                stack.push(new Expression("(" + a.value + " " + c + " " + b.value + ")"));
            }
        }
    }

    public String toInfix() {
        return stack.peek().value;
    }
}
