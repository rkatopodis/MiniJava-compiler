// Output created by jacc on Sun Jun 04 21:10:49 BRT 2017

package minijava;

    import minijava.ast.*;

class Parser implements TokensNew {
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
                case 156:
                    switch (yytok) {
                        case CLASS:
                            yyn = 3;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 1:
                    yyst[yysp] = 1;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 157:
                    switch (yytok) {
                        case ENDINPUT:
                            yyn = 312;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 2:
                    yyst[yysp] = 2;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 158:
                    switch (yytok) {
                        case CLASS:
                        case ENDINPUT:
                            yyn = yyr4();
                            continue;
                    }
                    yyn = 315;
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
                case 159:
                    switch (yytok) {
                        case ID:
                            yyn = 5;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 4:
                    yyst[yysp] = 4;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 160:
                    switch (yytok) {
                        case CLASS:
                            yyn = 7;
                            continue;
                        case ENDINPUT:
                            yyn = yyr1();
                            continue;
                    }
                    yyn = 315;
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
                case 161:
                    switch (yytok) {
                        case '{':
                            yyn = 8;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 6:
                    yyst[yysp] = 6;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 162:
                    switch (yytok) {
                        case CLASS:
                        case ENDINPUT:
                            yyn = yyr3();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 7:
                    yyst[yysp] = 7;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 163:
                    switch (yytok) {
                        case ID:
                            yyn = 9;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 8:
                    yyst[yysp] = 8;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 164:
                    switch (yytok) {
                        case PUBLIC:
                            yyn = 10;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 9:
                    yyst[yysp] = 9;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 165:
                    switch (yytok) {
                        case EXTENDS:
                            yyn = 11;
                            continue;
                        case '{':
                            yyn = 12;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 10:
                    yyst[yysp] = 10;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 166:
                    switch (yytok) {
                        case STATIC:
                            yyn = 13;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 11:
                    yyst[yysp] = 11;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 167:
                    switch (yytok) {
                        case ID:
                            yyn = 14;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 12:
                    yyst[yysp] = 12;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 168:
                    switch (yytok) {
                        case '}':
                        case INT:
                        case PUBLIC:
                        case ID:
                        case BOOLEAN:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 13:
                    yyst[yysp] = 13;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 169:
                    switch (yytok) {
                        case VOID:
                            yyn = 16;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 14:
                    yyst[yysp] = 14;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 170:
                    switch (yytok) {
                        case '{':
                            yyn = 17;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 15:
                    yyst[yysp] = 15;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 171:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 21;
                            continue;
                        case ID:
                            yyn = 22;
                            continue;
                        case INT:
                            yyn = 23;
                            continue;
                        case '}':
                        case PUBLIC:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 16:
                    yyst[yysp] = 16;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 172:
                    switch (yytok) {
                        case MAIN:
                            yyn = 24;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 17:
                    yyst[yysp] = 17;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 173:
                    switch (yytok) {
                        case '}':
                        case INT:
                        case PUBLIC:
                        case ID:
                        case BOOLEAN:
                            yyn = yyr8();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 18:
                    yyst[yysp] = 18;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 174:
                    switch (yytok) {
                        case PUBLIC:
                            yyn = 27;
                            continue;
                        case '}':
                            yyn = 28;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 19:
                    yyst[yysp] = 19;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 175:
                    switch (yytok) {
                        case ID:
                            yyn = 29;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 20:
                    yyst[yysp] = 20;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 176:
                    yyn = yys20();
                    continue;

                case 21:
                    yyst[yysp] = 21;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 177:
                    switch (yytok) {
                        case ID:
                            yyn = yyr17();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 22:
                    yyst[yysp] = 22;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 178:
                    switch (yytok) {
                        case ID:
                            yyn = yyr19();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 23:
                    yyst[yysp] = 23;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 179:
                    switch (yytok) {
                        case '[':
                            yyn = 30;
                            continue;
                        case ID:
                            yyn = yyr18();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 24:
                    yyst[yysp] = 24;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 180:
                    switch (yytok) {
                        case '(':
                            yyn = 31;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 25:
                    yyst[yysp] = 25;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 181:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 21;
                            continue;
                        case ID:
                            yyn = 22;
                            continue;
                        case INT:
                            yyn = 23;
                            continue;
                        case '}':
                        case PUBLIC:
                            yyn = yyr11();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 26:
                    yyst[yysp] = 26;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 182:
                    switch (yytok) {
                        case '}':
                        case PUBLIC:
                            yyn = yyr10();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 27:
                    yyst[yysp] = 27;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 183:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 21;
                            continue;
                        case ID:
                            yyn = 22;
                            continue;
                        case INT:
                            yyn = 23;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 28:
                    yyst[yysp] = 28;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 184:
                    switch (yytok) {
                        case CLASS:
                        case ENDINPUT:
                            yyn = yyr6();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 29:
                    yyst[yysp] = 29;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 185:
                    switch (yytok) {
                        case ';':
                            yyn = 34;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 30:
                    yyst[yysp] = 30;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 186:
                    switch (yytok) {
                        case ']':
                            yyn = 35;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 31:
                    yyst[yysp] = 31;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 187:
                    switch (yytok) {
                        case STRING:
                            yyn = 36;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 32:
                    yyst[yysp] = 32;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 188:
                    switch (yytok) {
                        case PUBLIC:
                            yyn = 27;
                            continue;
                        case '}':
                            yyn = 37;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 33:
                    yyst[yysp] = 33;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 189:
                    switch (yytok) {
                        case ID:
                            yyn = 38;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 34:
                    yyst[yysp] = 34;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 190:
                    yyn = yys34();
                    continue;

                case 35:
                    yyst[yysp] = 35;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 191:
                    switch (yytok) {
                        case ID:
                            yyn = yyr16();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 36:
                    yyst[yysp] = 36;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 192:
                    switch (yytok) {
                        case '[':
                            yyn = 39;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 37:
                    yyst[yysp] = 37;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 193:
                    switch (yytok) {
                        case CLASS:
                        case ENDINPUT:
                            yyn = yyr5();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 38:
                    yyst[yysp] = 38;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 194:
                    switch (yytok) {
                        case '(':
                            yyn = 40;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 39:
                    yyst[yysp] = 39;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 195:
                    switch (yytok) {
                        case ']':
                            yyn = 41;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 40:
                    yyst[yysp] = 40;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 196:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 21;
                            continue;
                        case ID:
                            yyn = 22;
                            continue;
                        case INT:
                            yyn = 23;
                            continue;
                        case ')':
                            yyn = 44;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 41:
                    yyst[yysp] = 41;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 197:
                    switch (yytok) {
                        case ID:
                            yyn = 45;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 42:
                    yyst[yysp] = 42;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 198:
                    switch (yytok) {
                        case ')':
                            yyn = 46;
                            continue;
                        case ',':
                            yyn = 47;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 43:
                    yyst[yysp] = 43;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 199:
                    switch (yytok) {
                        case ID:
                            yyn = 48;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 44:
                    yyst[yysp] = 44;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 200:
                    switch (yytok) {
                        case '{':
                            yyn = 49;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 45:
                    yyst[yysp] = 45;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 201:
                    switch (yytok) {
                        case ')':
                            yyn = 50;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 46:
                    yyst[yysp] = 46;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 202:
                    switch (yytok) {
                        case '{':
                            yyn = 51;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 47:
                    yyst[yysp] = 47;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 203:
                    switch (yytok) {
                        case BOOLEAN:
                            yyn = 21;
                            continue;
                        case ID:
                            yyn = 22;
                            continue;
                        case INT:
                            yyn = 23;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 48:
                    yyst[yysp] = 48;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 204:
                    switch (yytok) {
                        case ')':
                        case ',':
                            yyn = yyr15();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 49:
                    yyst[yysp] = 49;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 205:
                    yyn = yys49();
                    continue;

                case 50:
                    yyst[yysp] = 50;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 206:
                    switch (yytok) {
                        case '{':
                            yyn = 54;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 51:
                    yyst[yysp] = 51;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 207:
                    yyn = yys51();
                    continue;

                case 52:
                    yyst[yysp] = 52;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 208:
                    switch (yytok) {
                        case ID:
                            yyn = 56;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 53:
                    yyst[yysp] = 53;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 209:
                    yyn = yys53();
                    continue;

                case 54:
                    yyst[yysp] = 54;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 210:
                    switch (yytok) {
                        case ID:
                            yyn = 59;
                            continue;
                        case IF:
                            yyn = 60;
                            continue;
                        case PRINTLN:
                            yyn = 61;
                            continue;
                        case WHILE:
                            yyn = 62;
                            continue;
                        case '{':
                            yyn = 63;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 55:
                    yyst[yysp] = 55;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 211:
                    yyn = yys55();
                    continue;

                case 56:
                    yyst[yysp] = 56;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 212:
                    switch (yytok) {
                        case ')':
                        case ',':
                            yyn = yyr14();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 57:
                    yyst[yysp] = 57;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 213:
                    yyn = yys57();
                    continue;

                case 58:
                    yyst[yysp] = 58;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 214:
                    switch (yytok) {
                        case '}':
                            yyn = 67;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 59:
                    yyst[yysp] = 59;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 215:
                    switch (yytok) {
                        case '=':
                            yyn = 68;
                            continue;
                        case '[':
                            yyn = 69;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 60:
                    yyst[yysp] = 60;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 216:
                    switch (yytok) {
                        case '(':
                            yyn = 70;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 61:
                    yyst[yysp] = 61;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 217:
                    switch (yytok) {
                        case '(':
                            yyn = 71;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 62:
                    yyst[yysp] = 62;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 218:
                    switch (yytok) {
                        case '(':
                            yyn = 72;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 63:
                    yyst[yysp] = 63;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 219:
                    yyn = yys63();
                    continue;

                case 64:
                    yyst[yysp] = 64;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 220:
                    yyn = yys64();
                    continue;

                case 65:
                    yyst[yysp] = 65;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 221:
                    yyn = yys65();
                    continue;

                case 66:
                    yyst[yysp] = 66;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 222:
                    yyn = yys66();
                    continue;

                case 67:
                    yyst[yysp] = 67;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 223:
                    switch (yytok) {
                        case '}':
                            yyn = 91;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 68:
                    yyst[yysp] = 68;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 224:
                    yyn = yys68();
                    continue;

                case 69:
                    yyst[yysp] = 69;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 225:
                    yyn = yys69();
                    continue;

                case 70:
                    yyst[yysp] = 70;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 226:
                    yyn = yys70();
                    continue;

                case 71:
                    yyst[yysp] = 71;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 227:
                    yyn = yys71();
                    continue;

                case 72:
                    yyst[yysp] = 72;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 228:
                    yyn = yys72();
                    continue;

                case 73:
                    yyst[yysp] = 73;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 229:
                    yyn = yys73();
                    continue;

                case 74:
                    yyst[yysp] = 74;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 230:
                    yyn = yys74();
                    continue;

                case 75:
                    yyst[yysp] = 75;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 231:
                    switch (yytok) {
                        case AND:
                            yyn = 99;
                            continue;
                        case ';':
                            yyn = 100;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 76:
                    yyst[yysp] = 76;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 232:
                    yyn = yys76();
                    continue;

                case 77:
                    yyst[yysp] = 77;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 233:
                    yyn = yys77();
                    continue;

                case 78:
                    yyst[yysp] = 78;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 234:
                    yyn = yys78();
                    continue;

                case 79:
                    yyst[yysp] = 79;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 235:
                    yyn = yys79();
                    continue;

                case 80:
                    yyst[yysp] = 80;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 236:
                    yyn = yys80();
                    continue;

                case 81:
                    yyst[yysp] = 81;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 237:
                    yyn = yys81();
                    continue;

                case 82:
                    yyst[yysp] = 82;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 238:
                    yyn = yys82();
                    continue;

                case 83:
                    yyst[yysp] = 83;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 239:
                    switch (yytok) {
                        case ID:
                            yyn = 110;
                            continue;
                        case INT:
                            yyn = 111;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 84:
                    yyst[yysp] = 84;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 240:
                    yyn = yys84();
                    continue;

                case 85:
                    yyst[yysp] = 85;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 241:
                    yyn = yys85();
                    continue;

                case 86:
                    yyst[yysp] = 86;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 242:
                    yyn = yys86();
                    continue;

                case 87:
                    yyst[yysp] = 87;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 243:
                    yyn = yys87();
                    continue;

                case 88:
                    yyst[yysp] = 88;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 244:
                    yyn = yys88();
                    continue;

                case 89:
                    yyst[yysp] = 89;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 245:
                    yyn = yys89();
                    continue;

                case 90:
                    yyst[yysp] = 90;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 246:
                    yyn = yys90();
                    continue;

                case 91:
                    yyst[yysp] = 91;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 247:
                    switch (yytok) {
                        case CLASS:
                        case ENDINPUT:
                            yyn = yyr2();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 92:
                    yyst[yysp] = 92;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 248:
                    switch (yytok) {
                        case AND:
                            yyn = 99;
                            continue;
                        case ';':
                            yyn = 115;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 93:
                    yyst[yysp] = 93;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 249:
                    switch (yytok) {
                        case AND:
                            yyn = 99;
                            continue;
                        case ']':
                            yyn = 116;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 94:
                    yyst[yysp] = 94;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 250:
                    switch (yytok) {
                        case AND:
                            yyn = 99;
                            continue;
                        case ')':
                            yyn = 117;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 95:
                    yyst[yysp] = 95;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 251:
                    switch (yytok) {
                        case AND:
                            yyn = 99;
                            continue;
                        case ')':
                            yyn = 118;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 96:
                    yyst[yysp] = 96;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 252:
                    switch (yytok) {
                        case AND:
                            yyn = 99;
                            continue;
                        case ')':
                            yyn = 119;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 97:
                    yyst[yysp] = 97;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 253:
                    yyn = yys97();
                    continue;

                case 98:
                    yyst[yysp] = 98;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 254:
                    switch (yytok) {
                        case AND:
                            yyn = 99;
                            continue;
                        case ';':
                            yyn = 120;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 99:
                    yyst[yysp] = 99;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 255:
                    yyn = yys99();
                    continue;

                case 100:
                    yyst[yysp] = 100;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 256:
                    switch (yytok) {
                        case '}':
                            yyn = 122;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 101:
                    yyst[yysp] = 101;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 257:
                    yyn = yys101();
                    continue;

                case 102:
                    yyst[yysp] = 102;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 258:
                    yyn = yys102();
                    continue;

                case 103:
                    yyst[yysp] = 103;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 259:
                    switch (yytok) {
                        case ID:
                            yyn = 125;
                            continue;
                        case LENGTH:
                            yyn = 126;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 104:
                    yyst[yysp] = 104;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 260:
                    yyn = yys104();
                    continue;

                case 105:
                    yyst[yysp] = 105;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 261:
                    yyn = yys105();
                    continue;

                case 106:
                    yyst[yysp] = 106;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 262:
                    yyn = yys106();
                    continue;

                case 107:
                    yyst[yysp] = 107;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 263:
                    yyn = yys107();
                    continue;

                case 108:
                    yyst[yysp] = 108;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 264:
                    yyn = yys108();
                    continue;

                case 109:
                    yyst[yysp] = 109;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 265:
                    yyn = yys109();
                    continue;

                case 110:
                    yyst[yysp] = 110;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 266:
                    switch (yytok) {
                        case '(':
                            yyn = 133;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 111:
                    yyst[yysp] = 111;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 267:
                    switch (yytok) {
                        case '[':
                            yyn = 134;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 112:
                    yyst[yysp] = 112;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 268:
                    yyn = yys112();
                    continue;

                case 113:
                    yyst[yysp] = 113;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 269:
                    switch (yytok) {
                        case AND:
                            yyn = 99;
                            continue;
                        case ')':
                            yyn = 135;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 114:
                    yyst[yysp] = 114;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 270:
                    yyn = yys114();
                    continue;

                case 115:
                    yyst[yysp] = 115;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 271:
                    yyn = yys115();
                    continue;

                case 116:
                    yyst[yysp] = 116;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 272:
                    switch (yytok) {
                        case '=':
                            yyn = 136;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 117:
                    yyst[yysp] = 117;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 273:
                    switch (yytok) {
                        case ID:
                            yyn = 59;
                            continue;
                        case IF:
                            yyn = 60;
                            continue;
                        case PRINTLN:
                            yyn = 61;
                            continue;
                        case WHILE:
                            yyn = 62;
                            continue;
                        case '{':
                            yyn = 63;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 118:
                    yyst[yysp] = 118;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 274:
                    switch (yytok) {
                        case ';':
                            yyn = 138;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 119:
                    yyst[yysp] = 119;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 275:
                    switch (yytok) {
                        case ID:
                            yyn = 59;
                            continue;
                        case IF:
                            yyn = 60;
                            continue;
                        case PRINTLN:
                            yyn = 61;
                            continue;
                        case WHILE:
                            yyn = 62;
                            continue;
                        case '{':
                            yyn = 63;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 120:
                    yyst[yysp] = 120;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 276:
                    switch (yytok) {
                        case '}':
                            yyn = 140;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 121:
                    yyst[yysp] = 121;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 277:
                    yyn = yys121();
                    continue;

                case 122:
                    yyst[yysp] = 122;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 278:
                    switch (yytok) {
                        case '}':
                        case PUBLIC:
                            yyn = yyr12();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 123:
                    yyst[yysp] = 123;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 279:
                    yyn = yys123();
                    continue;

                case 124:
                    yyst[yysp] = 124;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 280:
                    yyn = yys124();
                    continue;

                case 125:
                    yyst[yysp] = 125;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 281:
                    yyn = yys125();
                    continue;

                case 126:
                    yyst[yysp] = 126;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 282:
                    yyn = yys126();
                    continue;

                case 127:
                    yyst[yysp] = 127;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 283:
                    switch (yytok) {
                        case AND:
                            yyn = 99;
                            continue;
                        case ']':
                            yyn = 142;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 128:
                    yyst[yysp] = 128;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 284:
                    yyn = yys128();
                    continue;

                case 129:
                    yyst[yysp] = 129;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 285:
                    yyn = yys129();
                    continue;

                case 130:
                    yyst[yysp] = 130;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 286:
                    yyn = yys130();
                    continue;

                case 131:
                    yyst[yysp] = 131;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 287:
                    yyn = yys131();
                    continue;

                case 132:
                    yyst[yysp] = 132;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 288:
                    yyn = yys132();
                    continue;

                case 133:
                    yyst[yysp] = 133;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 289:
                    switch (yytok) {
                        case ')':
                            yyn = 143;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 134:
                    yyst[yysp] = 134;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 290:
                    yyn = yys134();
                    continue;

                case 135:
                    yyst[yysp] = 135;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 291:
                    yyn = yys135();
                    continue;

                case 136:
                    yyst[yysp] = 136;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 292:
                    yyn = yys136();
                    continue;

                case 137:
                    yyst[yysp] = 137;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 293:
                    yyn = yys137();
                    continue;

                case 138:
                    yyst[yysp] = 138;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 294:
                    yyn = yys138();
                    continue;

                case 139:
                    yyst[yysp] = 139;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 295:
                    yyn = yys139();
                    continue;

                case 140:
                    yyst[yysp] = 140;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 296:
                    switch (yytok) {
                        case '}':
                        case PUBLIC:
                            yyn = yyr13();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 141:
                    yyst[yysp] = 141;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 297:
                    yyn = yys141();
                    continue;

                case 142:
                    yyst[yysp] = 142;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 298:
                    yyn = yys142();
                    continue;

                case 143:
                    yyst[yysp] = 143;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 299:
                    yyn = yys143();
                    continue;

                case 144:
                    yyst[yysp] = 144;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 300:
                    switch (yytok) {
                        case AND:
                            yyn = 99;
                            continue;
                        case ']':
                            yyn = 150;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 145:
                    yyst[yysp] = 145;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 301:
                    switch (yytok) {
                        case AND:
                            yyn = 99;
                            continue;
                        case ';':
                            yyn = 151;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 146:
                    yyst[yysp] = 146;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 302:
                    switch (yytok) {
                        case ID:
                            yyn = 59;
                            continue;
                        case IF:
                            yyn = 60;
                            continue;
                        case PRINTLN:
                            yyn = 61;
                            continue;
                        case WHILE:
                            yyn = 62;
                            continue;
                        case '{':
                            yyn = 63;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 147:
                    yyst[yysp] = 147;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 303:
                    switch (yytok) {
                        case AND:
                            yyn = 99;
                            continue;
                        case ')':
                        case ',':
                            yyn = yyr59();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 148:
                    yyst[yysp] = 148;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 304:
                    switch (yytok) {
                        case ')':
                            yyn = 153;
                            continue;
                        case ',':
                            yyn = 154;
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 149:
                    yyst[yysp] = 149;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 305:
                    yyn = yys149();
                    continue;

                case 150:
                    yyst[yysp] = 150;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 306:
                    yyn = yys150();
                    continue;

                case 151:
                    yyst[yysp] = 151;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 307:
                    yyn = yys151();
                    continue;

                case 152:
                    yyst[yysp] = 152;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 308:
                    yyn = yys152();
                    continue;

                case 153:
                    yyst[yysp] = 153;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 309:
                    yyn = yys153();
                    continue;

                case 154:
                    yyst[yysp] = 154;
                    yysv[yysp] = (token
                                 );
                    yytok = (proximo()
                            );
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 310:
                    yyn = yys154();
                    continue;

                case 155:
                    yyst[yysp] = 155;
                    if (++yysp>=yyst.length) {
                        yyexpand();
                    }
                case 311:
                    switch (yytok) {
                        case AND:
                            yyn = 99;
                            continue;
                        case ')':
                        case ',':
                            yyn = yyr58();
                            continue;
                    }
                    yyn = 315;
                    continue;

                case 312:
                    return true;
                case 313:
                    yyerror("stack overflow");
                case 314:
                    return false;
                case 315:
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

    private int yys20() {
        switch (yytok) {
            case WHILE:
            case '{':
            case RETURN:
            case INT:
            case PUBLIC:
            case PRINTLN:
            case IF:
            case '}':
            case ID:
            case BOOLEAN:
                return yyr7();
        }
        return 315;
    }

    private int yys34() {
        switch (yytok) {
            case WHILE:
            case '{':
            case RETURN:
            case INT:
            case PUBLIC:
            case PRINTLN:
            case IF:
            case '}':
            case ID:
            case BOOLEAN:
                return yyr9();
        }
        return 315;
    }

    private int yys49() {
        switch (yytok) {
            case WHILE:
            case '{':
            case RETURN:
            case INT:
            case PRINTLN:
            case IF:
            case ID:
            case BOOLEAN:
                return yyr8();
        }
        return 315;
    }

    private int yys51() {
        switch (yytok) {
            case WHILE:
            case '{':
            case RETURN:
            case INT:
            case PRINTLN:
            case IF:
            case ID:
            case BOOLEAN:
                return yyr8();
        }
        return 315;
    }

    private int yys53() {
        switch (yytok) {
            case BOOLEAN:
                return 21;
            case ID:
                return 22;
            case INT:
                return 23;
            case WHILE:
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
                return yyr28();
        }
        return 315;
    }

    private int yys55() {
        switch (yytok) {
            case BOOLEAN:
                return 21;
            case ID:
                return 22;
            case INT:
                return 23;
            case WHILE:
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
                return yyr28();
        }
        return 315;
    }

    private int yys57() {
        switch (yytok) {
            case ID:
                return 59;
            case IF:
                return 60;
            case PRINTLN:
                return 61;
            case WHILE:
                return 62;
            case '{':
                return 63;
            case RETURN:
                return 66;
        }
        return 315;
    }

    private int yys63() {
        switch (yytok) {
            case WHILE:
            case '}':
            case '{':
            case PRINTLN:
            case IF:
            case ID:
                return yyr28();
        }
        return 315;
    }

    private int yys64() {
        switch (yytok) {
            case ID:
                return 59;
            case IF:
                return 60;
            case PRINTLN:
                return 61;
            case WHILE:
                return 62;
            case '{':
                return 63;
            case RETURN:
                return 74;
        }
        return 315;
    }

    private int yys65() {
        switch (yytok) {
            case WHILE:
            case '}':
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
            case ID:
                return yyr27();
        }
        return 315;
    }

    private int yys66() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys68() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys69() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys70() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys71() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys72() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys73() {
        switch (yytok) {
            case ID:
                return 59;
            case IF:
                return 60;
            case PRINTLN:
                return 61;
            case WHILE:
                return 62;
            case '{':
                return 63;
            case '}':
                return 97;
        }
        return 315;
    }

    private int yys74() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys76() {
        switch (yytok) {
            case '*':
                return 101;
            case '/':
                return 102;
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr37();
        }
        return 315;
    }

    private int yys77() {
        switch (yytok) {
            case '.':
                return 103;
            case '[':
                return 104;
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr50();
        }
        return 315;
    }

    private int yys78() {
        switch (yytok) {
            case '+':
                return 105;
            case '-':
                return 106;
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case ',':
            case AND:
                return yyr34();
        }
        return 315;
    }

    private int yys79() {
        switch (yytok) {
            case EQUALS:
                return 107;
            case NEQUALS:
                return 108;
            case '<':
                return 109;
            case ')':
            case ']':
            case ';':
            case ',':
            case AND:
                return yyr30();
        }
        return 315;
    }

    private int yys80() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr40();
        }
        return 315;
    }

    private int yys81() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr44();
        }
        return 315;
    }

    private int yys82() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case '[':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '.':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr51();
        }
        return 315;
    }

    private int yys84() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr46();
        }
        return 315;
    }

    private int yys85() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr45();
        }
        return 315;
    }

    private int yys86() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case '[':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '.':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr52();
        }
        return 315;
    }

    private int yys87() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr43();
        }
        return 315;
    }

    private int yys88() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys89() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys90() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys97() {
        switch (yytok) {
            case WHILE:
            case '}':
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
            case ID:
            case ELSE:
                return yyr20();
        }
        return 315;
    }

    private int yys99() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys101() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys102() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys104() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys105() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys106() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys107() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys108() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys109() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys112() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr41();
        }
        return 315;
    }

    private int yys114() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr42();
        }
        return 315;
    }

    private int yys115() {
        switch (yytok) {
            case WHILE:
            case '}':
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
            case ID:
            case ELSE:
                return yyr25();
        }
        return 315;
    }

    private int yys121() {
        switch (yytok) {
            case EQUALS:
                return 107;
            case NEQUALS:
                return 108;
            case '<':
                return 109;
            case ')':
            case ']':
            case ';':
            case ',':
            case AND:
                return yyr29();
        }
        return 315;
    }

    private int yys123() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr38();
        }
        return 315;
    }

    private int yys124() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr39();
        }
        return 315;
    }

    private int yys125() {
        switch (yytok) {
            case '(':
                return 141;
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case '[':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '.':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr55();
        }
        return 315;
    }

    private int yys126() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr48();
        }
        return 315;
    }

    private int yys128() {
        switch (yytok) {
            case '*':
                return 101;
            case '/':
                return 102;
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr35();
        }
        return 315;
    }

    private int yys129() {
        switch (yytok) {
            case '*':
                return 101;
            case '/':
                return 102;
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr36();
        }
        return 315;
    }

    private int yys130() {
        switch (yytok) {
            case '+':
                return 105;
            case '-':
                return 106;
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case ',':
            case AND:
                return yyr32();
        }
        return 315;
    }

    private int yys131() {
        switch (yytok) {
            case '+':
                return 105;
            case '-':
                return 106;
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case ',':
            case AND:
                return yyr33();
        }
        return 315;
    }

    private int yys132() {
        switch (yytok) {
            case '+':
                return 105;
            case '-':
                return 106;
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case ',':
            case AND:
                return yyr31();
        }
        return 315;
    }

    private int yys134() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys135() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case '[':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '.':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr54();
        }
        return 315;
    }

    private int yys136() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yys137() {
        switch (yytok) {
            case ELSE:
                return 146;
            case WHILE:
            case '}':
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
            case ID:
                return yyr21();
        }
        return 315;
    }

    private int yys138() {
        switch (yytok) {
            case WHILE:
            case '}':
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
            case ID:
            case ELSE:
                return yyr24();
        }
        return 315;
    }

    private int yys139() {
        switch (yytok) {
            case WHILE:
            case '}':
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
            case ID:
            case ELSE:
                return yyr23();
        }
        return 315;
    }

    private int yys141() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
            case ')':
                return 149;
        }
        return 315;
    }

    private int yys142() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr49();
        }
        return 315;
    }

    private int yys143() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case '[':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '.':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr53();
        }
        return 315;
    }

    private int yys149() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case '[':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '.':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr57();
        }
        return 315;
    }

    private int yys150() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr47();
        }
        return 315;
    }

    private int yys151() {
        switch (yytok) {
            case WHILE:
            case '}':
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
            case ID:
            case ELSE:
                return yyr26();
        }
        return 315;
    }

    private int yys152() {
        switch (yytok) {
            case WHILE:
            case '}':
            case '{':
            case RETURN:
            case PRINTLN:
            case IF:
            case ID:
            case ELSE:
                return yyr22();
        }
        return 315;
    }

    private int yys153() {
        switch (yytok) {
            case '*':
            case ')':
            case NEQUALS:
            case ']':
            case '[':
            case EQUALS:
            case '<':
            case ';':
            case '/':
            case '.':
            case '-':
            case ',':
            case '+':
            case AND:
                return yyr56();
        }
        return 315;
    }

    private int yys154() {
        switch (yytok) {
            case FALSE:
                return 81;
            case ID:
                return 82;
            case NEW:
                return 83;
            case NULL:
                return 84;
            case NUM:
                return 85;
            case THIS:
                return 86;
            case TRUE:
                return 87;
            case '!':
                return 88;
            case '(':
                return 89;
            case '-':
                return 90;
        }
        return 315;
    }

    private int yyr1() { // prog : main classes
        { saida = new Prog(((Main)yysv[yysp-2]), ((java.util.List)yysv[yysp-1])); yyrv = saida; }
        yysv[yysp-=2] = yyrv;
        return 1;
    }

    private int yyr5() { // classe : CLASS ID EXTENDS ID '{' vars metodos '}'
        { yyrv = new Classe(((Token)yysv[yysp-7]).texto, ((Token)yysv[yysp-5]).texto, yysv[yysp-4], ((java.util.List)yysv[yysp-3])); }
        yysv[yysp-=8] = yyrv;
        return 6;
    }

    private int yyr6() { // classe : CLASS ID '{' vars metodos '}'
        { yyrv = new Classe(((Token)yysv[yysp-5]).texto, ((java.util.List)yysv[yysp-2]), yysv[yysp-1]); }
        yysv[yysp-=6] = yyrv;
        return 6;
    }

    private int yyr3() { // classes : classes classe
        { ((java.util.List)yysv[yysp-2]).add(0, ((Classe)yysv[yysp-1])); yyrv = ((java.util.List)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return 4;
    }

    private int yyr4() { // classes : /* empty */
        { yyrv = new java.util.ArrayList<Classe>(); }
        yysv[yysp-=0] = yyrv;
        return 4;
    }

    private int yyr20() { // cmd : '{' cmds '}'
        { yyrv = new Bloco(((java.util.List)yysv[yysp-2])); }
        yysv[yysp-=3] = yyrv;
        return yypcmd();
    }

    private int yyr21() { // cmd : IF '(' exp ')' cmd
        { yyrv = new If(((Exp)yysv[yysp-3]), ((Cmd)yysv[yysp-1]), ((Token)yysv[yysp-5]).lin); }
        yysv[yysp-=5] = yyrv;
        return yypcmd();
    }

    private int yyr22() { // cmd : IF '(' exp ')' cmd ELSE cmd
        { yyrv = new If(((Exp)yysv[yysp-5]), ((Cmd)yysv[yysp-3]), ((Cmd)yysv[yysp-1]), ((Token)yysv[yysp-7]).lin); }
        yysv[yysp-=7] = yyrv;
        return yypcmd();
    }

    private int yyr23() { // cmd : WHILE '(' exp ')' cmd
        { yyrv = new While(((Exp)yysv[yysp-3]), ((Cmd)yysv[yysp-1]), ((Token)yysv[yysp-5]).lin); }
        yysv[yysp-=5] = yyrv;
        return yypcmd();
    }

    private int yyr24() { // cmd : PRINTLN '(' exp ')' ';'
        { yyrv = new Println(((Exp)yysv[yysp-3]), ((Token)yysv[yysp-5]).lin); }
        yysv[yysp-=5] = yyrv;
        return yypcmd();
    }

    private int yyr25() { // cmd : ID '=' exp ';'
        { yyrv = new Atrib(((Token)yysv[yysp-4]).texto, ((Exp)yysv[yysp-2]), yysv[yysp-3].lin); }
        yysv[yysp-=4] = yyrv;
        return yypcmd();
    }

    private int yyr26() { // cmd : ID '[' exp ']' '=' exp ';'
        { yyrv = new AtribVetor(((Token)yysv[yysp-7]).texto, ((Exp)yysv[yysp-5]), ((Exp)yysv[yysp-2]), yysv[yysp-3].lin); }
        yysv[yysp-=7] = yyrv;
        return yypcmd();
    }

    private int yypcmd() {
        switch (yyst[yysp-1]) {
            case 146: return 152;
            case 119: return 139;
            case 117: return 137;
            case 54: return 58;
            default: return 65;
        }
    }

    private int yyr27() { // cmds : cmds cmd
        { ((java.util.List)yysv[yysp-2]).add(((Cmd)yysv[yysp-1])); yyrv = ((java.util.List)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return yypcmds();
    }

    private int yyr28() { // cmds : /* empty */
        { yyrv = new java.util.ArrayList<Cmd>(); }
        yysv[yysp-=0] = yyrv;
        return yypcmds();
    }

    private int yypcmds() {
        switch (yyst[yysp-1]) {
            case 55: return 64;
            case 53: return 57;
            default: return 73;
        }
    }

    private int yyr29() { // exp : exp AND rexp
        { yyrv = new And(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yypexp();
    }

    private int yyr30() { // exp : rexp
        yysp -= 1;
        return yypexp();
    }

    private int yypexp() {
        switch (yyst[yysp-1]) {
            case 141: return 147;
            case 136: return 145;
            case 134: return 144;
            case 104: return 127;
            case 89: return 113;
            case 74: return 98;
            case 72: return 96;
            case 71: return 95;
            case 70: return 94;
            case 69: return 93;
            case 68: return 92;
            case 66: return 75;
            default: return 155;
        }
    }

    private int yyr58() { // exps : exps ',' exp
        { ((java.util.List)yysv[yysp-3]).add(((Exp)yysv[yysp-1])); yyrv = ((java.util.List)yysv[yysp-3]); }
        yysv[yysp-=3] = yyrv;
        return 148;
    }

    private int yyr59() { // exps : exp
        { java.util.List<Exp> l = new java.util.ArrayList<Exp>();
                        l.add(((Exp)yysv[yysp-1])); yyrv = l; }
        yysv[yysp-=1] = yyrv;
        return 148;
    }

    private int yyr2() { // main : CLASS ID '{' PUBLIC STATIC VOID MAIN '(' STRING '[' ']' ID ')' '{' cmd '}' '}'
        { yyrv = new Main(((Token)yysv[yysp-16]).texto, ((Token)yysv[yysp-6]).texto, ((Cmd)yysv[yysp-3])); }
        yysv[yysp-=17] = yyrv;
        return 2;
    }

    private int yyr12() { // metodo : PUBLIC tipo ID '(' ')' '{' vars cmds RETURN exp ';' '}'
        { yyrv = new Metodo(((String)yysv[yysp-11]), ((Token)yysv[yysp-10]).texto, new java.util.ArrayList<Var>(), ((java.util.List)yysv[yysp-6]), ((java.util.List)yysv[yysp-5]), ((Exp)yysv[yysp-3])); }
        yysv[yysp-=12] = yyrv;
        return 26;
    }

    private int yyr13() { // metodo : PUBLIC tipo ID '(' params ')' '{' vars cmds RETURN exp ';' '}'
        { yyrv = new Metodo(((String)yysv[yysp-12]), ((Token)yysv[yysp-11]).texto, ((java.util.List)yysv[yysp-9]), ((java.util.List)yysv[yysp-6]), ((java.util.List)yysv[yysp-5]), ((Exp)yysv[yysp-3])); }
        yysv[yysp-=13] = yyrv;
        return 26;
    }

    private int yyr10() { // metodos : metodos metodo
        { ((java.util.List)yysv[yysp-2]).add(0, ((Metodo)yysv[yysp-1])); yyrv = ((java.util.List)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return yypmetodos();
    }

    private int yyr11() { // metodos : /* empty */
        { yyrv = new java.util.ArrayList<Metodo>(); }
        yysv[yysp-=0] = yyrv;
        return yypmetodos();
    }

    private int yypmetodos() {
        switch (yyst[yysp-1]) {
            case 15: return 18;
            default: return 32;
        }
    }

    private int yyr38() { // mexp : mexp '*' sexp
        { yyrv = new Mult(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yypmexp();
    }

    private int yyr39() { // mexp : mexp '/' sexp
        { yyrv = new Div(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yypmexp();
    }

    private int yyr40() { // mexp : sexp
        yysp -= 1;
        return yypmexp();
    }

    private int yypmexp() {
        switch (yyst[yysp-1]) {
            case 106: return 129;
            case 105: return 128;
            default: return 76;
        }
    }

    private int yyr14() { // params : params ',' tipo ID
        { ((java.util.List)yysv[yysp-4]).add(new Var(((String)yysv[yysp-2]), ((Token)yysv[yysp-1]).texto, ((Token)yysv[yysp-1]).lin)); yyrv = ((java.util.List)yysv[yysp-4]); }
        yysv[yysp-=4] = yyrv;
        return 42;
    }

    private int yyr15() { // params : tipo ID
        { java.util.List<Var> l = new java.util.ArrayList<Var>();
                                l.add(new Var(((String)yysv[yysp-2]), ((Token)yysv[yysp-1]).texto, ((Token)yysv[yysp-1]).lin)); yyrv = l; }
        yysv[yysp-=2] = yyrv;
        return 42;
    }

    private int yyr51() { // pexp : ID
        { yyrv = new Id(((Token)yysv[yysp-1]).texto, ((Token)yysv[yysp-1]).lin); }
        yysv[yysp-=1] = yyrv;
        return 77;
    }

    private int yyr52() { // pexp : THIS
        { yyrv = new This(((Token)yysv[yysp-1]).lin); }
        yysv[yysp-=1] = yyrv;
        return 77;
    }

    private int yyr53() { // pexp : NEW ID '(' ')'
        { yyrv = new New(((Token)yysv[yysp-3]).texto, ((Token)yysv[yysp-4]).lin); }
        yysv[yysp-=4] = yyrv;
        return 77;
    }

    private int yyr54() { // pexp : '(' exp ')'
        { yyrv = ((Exp)yysv[yysp-2]); }
        yysv[yysp-=3] = yyrv;
        return 77;
    }

    private int yyr55() { // pexp : pexp '.' ID
        { yyrv = new Campo(((Exp)yysv[yysp-3]), ((Token)yysv[yysp-1]).texto, ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return 77;
    }

    private int yyr56() { // pexp : pexp '.' ID '(' exps ')'
        { yyrv = new Chamada(((Exp)yysv[yysp-6]), ((Token)yysv[yysp-4]).texto, ((java.util.List)yysv[yysp-2]), ((Token)yysv[yysp-5]).lin); }
        yysv[yysp-=6] = yyrv;
        return 77;
    }

    private int yyr57() { // pexp : pexp '.' ID '(' ')'
        { yyrv = new Chamada(((Exp)yysv[yysp-5]), ((Token)yysv[yysp-3]).texto, new java.util.ArrayList<Exp>(), ((Token)yysv[yysp-4]).lin); }
        yysv[yysp-=5] = yyrv;
        return 77;
    }

    private int yyr35() { // aexp : aexp '+' mexp
        { yyrv = new Soma(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yypaexp();
    }

    private int yyr36() { // aexp : aexp '-' mexp
        { yyrv = new Sub(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yypaexp();
    }

    private int yyr37() { // aexp : mexp
        yysp -= 1;
        return yypaexp();
    }

    private int yypaexp() {
        switch (yyst[yysp-1]) {
            case 109: return 132;
            case 108: return 131;
            case 107: return 130;
            default: return 78;
        }
    }

    private int yyr31() { // rexp : rexp '<' aexp
        { yyrv = new MenorQue(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yyprexp();
    }

    private int yyr32() { // rexp : rexp EQUALS aexp
        { yyrv = new Igual(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yyprexp();
    }

    private int yyr33() { // rexp : rexp NEQUALS aexp
        { yyrv = new Diferente(((Exp)yysv[yysp-3]), ((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yyprexp();
    }

    private int yyr34() { // rexp : aexp
        yysp -= 1;
        return yyprexp();
    }

    private int yyprexp() {
        switch (yyst[yysp-1]) {
            case 99: return 121;
            default: return 79;
        }
    }

    private int yyr41() { // sexp : '!' sexp
        { yyrv = new Nao(((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=2] = yyrv;
        return yypsexp();
    }

    private int yyr42() { // sexp : '-' sexp
        { yyrv = new Neg(((Exp)yysv[yysp-1]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=2] = yyrv;
        return yypsexp();
    }

    private int yyr43() { // sexp : TRUE
        { yyrv = new True(); }
        yysv[yysp-=1] = yyrv;
        return yypsexp();
    }

    private int yyr44() { // sexp : FALSE
        { yyrv = new False(); }
        yysv[yysp-=1] = yyrv;
        return yypsexp();
    }

    private int yyr45() { // sexp : NUM
        { yyrv = new Num(((Token)yysv[yysp-1]).texto); }
        yysv[yysp-=1] = yyrv;
        return yypsexp();
    }

    private int yyr46() { // sexp : NULL
        { yyrv = new Null(); }
        yysv[yysp-=1] = yyrv;
        return yypsexp();
    }

    private int yyr47() { // sexp : NEW INT '[' exp ']'
        { yyrv = new Vetor(((Exp)yysv[yysp-2]), ((Token)yysv[yysp-5]).lin); }
        yysv[yysp-=5] = yyrv;
        return yypsexp();
    }

    private int yyr48() { // sexp : pexp '.' LENGTH
        { yyrv = new Length(((Exp)yysv[yysp-3]), ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return yypsexp();
    }

    private int yyr49() { // sexp : pexp '[' exp ']'
        { yyrv = new Indexa(((Exp)yysv[yysp-4]), ((Exp)yysv[yysp-2]), ((Token)yysv[yysp-3]).lin); }
        yysv[yysp-=4] = yyrv;
        return yypsexp();
    }

    private int yyr50() { // sexp : pexp
        yysp -= 1;
        return yypsexp();
    }

    private int yypsexp() {
        switch (yyst[yysp-1]) {
            case 102: return 124;
            case 101: return 123;
            case 90: return 114;
            case 88: return 112;
            default: return 80;
        }
    }

    private int yyr16() { // tipo : INT '[' ']'
        { yyrv = "int[]"; }
        yysv[yysp-=3] = yyrv;
        return yyptipo();
    }

    private int yyr17() { // tipo : BOOLEAN
        { yyrv = "boolean"; }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyr18() { // tipo : INT
        { yyrv = "int"; }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyr19() { // tipo : ID
        { yyrv = ((Token)yysv[yysp-1]).texto; }
        yysv[yysp-=1] = yyrv;
        return yyptipo();
    }

    private int yyptipo() {
        switch (yyst[yysp-1]) {
            case 47: return 52;
            case 40: return 43;
            case 27: return 33;
            default: return 19;
        }
    }

    private int yyr9() { // var : tipo ID ';'
        { yyrv = new Var(((String)yysv[yysp-3]), ((Token)yysv[yysp-2]).texto, ((Token)yysv[yysp-2]).lin); }
        yysv[yysp-=3] = yyrv;
        return 20;
    }

    private int yyr7() { // vars : vars var
        { ((java.util.List)yysv[yysp-2]).add(((Var)yysv[yysp-1])); yyrv = ((java.util.List)yysv[yysp-2]); }
        yysv[yysp-=2] = yyrv;
        return yypvars();
    }

    private int yyr8() { // vars : /* empty */
        { yyrv = new java.util.ArrayList<Var>(); }
        yysv[yysp-=0] = yyrv;
        return yypvars();
    }

    private int yypvars() {
        switch (yyst[yysp-1]) {
            case 49: return 53;
            case 17: return 25;
            case 12: return 15;
            default: return 55;
        }
    }

    protected String[] yyerrmsgs = {
    };


Scanner scan;

Token token;  // lookahead
int tipo;     // tipo do lookahead

public Prog saida; // workaround pro bug do tipo do parse()

public Parser(java.io.Reader entrada) {
  scan = new Scanner(entrada);
  proximo(); // inicializa o lookahead
}

int proximo() {
  try {
    token = scan.nextToken();
    tipo = token.tipo;
    return tipo;
  } catch(java.io.IOException e) {
    throw new RuntimeException(e);
  }
}

void yyerror(String msg) {
  throw new RuntimeException("erro de sintaxe na linha: " + token.lin);
}

}
