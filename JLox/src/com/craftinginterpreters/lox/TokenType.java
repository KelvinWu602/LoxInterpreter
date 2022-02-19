package com.craftinginterpreters.lox;

enum TokenType{
    // single char
    LEFT_PAREN, RIGHT_PAREN, LEFT_BRACE, RIGHT_BRACE,
    COMMA, DOT, PLUS, MINUS, SEMICOLON, SLASH, STAR,
    // one or two characters
    BANG, BANG_EQUAL, EQUAL, EQUAL_EQUAL,
    GREATER, GREATER_EQUAL, LESS, LESS_EQUAL,
    // identifier
    IDENTIFIER, STRING, NUMBER,
    // keywords
    AND,CLASS,ELSE,FALSE,TRUE,FUN,FOR,IF,NIL,OR,PRINT,RETURN,SUPER,THIS,VAR,WHILE,

    EOF
}

