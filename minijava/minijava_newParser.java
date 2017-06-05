// Output created by jacc on Sun Jun 04 15:43:59 BRT 2017


class minijava_newParser implements minijava_newTokens {
    private int yyss = 100;
    private int yytok;
    private int yysp = 0;
    private int[] yyst;
    protected int yyerrno = (-1);
    private Object[] yysv;
    private Object yyrv;

    public boolean parse() {
        int yyn = 0;
        yysp = 0;
        yyst = new int[yyss];
        yysv = new Object[yyss];
        yytok = (tipo
                 );
    loop:
        for (;;) {
            switch (yyn) {
                case 0:
                    yyst[yysp] = 0;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 7:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 2;
                            continue;
                        case ID:
                            yyn = 3;
                            continue;
                        case INT:
                            yyn = 4;
                            continue;
                    }
                    yyn = 17;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 8:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 14;
                            continue;
                    }
                    yyn = 17;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 9:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 17;
                    continue;

                case 3:
                    yyst[yysp] = 3;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 10:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 17;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 11:
                    switch (yytok) {
                        case '[':
                            yyn = 5;
                            continue;
                        case ENDINPUT:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 17;
                    continue;

                case 5:
                    yyst[yysp] = 5;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 12:
                    switch (yytok) {
                        case ']':
                            yyn = 6;
                            continue;
                    }
                    yyn = 17;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 13:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 17;
                    continue;

                case 14:
                    return true;
                case 15:
                    yyerror("stack overflow");
                case 16:
                    return false;
                case 17:
                    yyerror("syntax error");
                    return false;
            }
        }
    }

    protected void yyexpand() {
        int[] newyyst = new int[2*yyst.length];
        Object[] newyysv = new Object[2*yyst.length];
        for (int i=0; i<yyst.length; i++) {
            newyyst[i] = yyst[i];
            newyysv[i] = yysv[i];
        }
        yyst = newyyst;
        yysv = newyysv;
    }

    private int yyr1() { // tipo : INT '[' ']'
        { yyrv = "int[]"; }
        yysv[yysp-=3] = yyrv;
        return 1;
    }

    private int yyr2() { // tipo : BOOLEAN
        { yyrv = "boolean"; }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr3() { // tipo : INT
        { yyrv = "int"; }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    private int yyr4() { // tipo : ID
        { yyrv = ((Token)yysv[yysp-1]).texto; }
        yysv[yysp-=1] = yyrv;
        return 1;
    }

    protected String[] yyerrmsgs = {
    };


}
