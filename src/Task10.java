import java.util.Scanner;

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        String string = scanner.nextLine();
        string = string.replaceAll(" ", "");
        int array[] = new int[string.length()];
        String str = "";
        String str1 = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
        String str5 = "";
        String str6 = "";
        String str7 = "";
        String str8 = "";
        String str9 = "";
        String strFull = "";
        for (int i = 0; i < string.length(); i++) {
            array[i] = Integer.parseInt(String.valueOf(string.charAt(i)));
        }

//        System.out.println(Arrays.toString(array));
        int number = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < array.length; j++) {
                number = array[j];
                if (number == 0) {
                    if (i == 0) {
                        str = "   ***   ";
                    } else if (i == 1) {
                        str = "  *   *  ";
                    } else if (i == 2) {
                        str = " *     * ";
                    } else if (i == 3) {
                        str = " *     * ";
                    } else if (i == 4) {
                        str = " *     * ";
                    } else if (i == 5) {
                        str = "  *   *  ";
                    } else if (i == 6) {
                        str = "   ***   ";
                    }
                } else if (number == 1) {
                    if (i == 0) {
                        str1 = "  *  ";
                    } else if (i == 1) {
                        str1 = " **  ";
                    } else if (i == 2) {
                        str1 = "  *  ";
                    } else if (i == 3) {
                        str1 = "  *  ";
                    } else if (i == 4) {
                        str1 = "  *  ";
                    } else if (i == 5) {
                        str1 = "  *  ";
                    } else if (i == 6) {
                        str1 = " *** ";
                    }
                } else if (number == 2) {
                    if (i == 0) {
                        str2 = "  ***  ";
                    } else if (i == 1) {
                        str2 = " *   * ";
                    } else if (i == 2) {
                        str2 = " *  *  ";
                    } else if (i == 3) {
                        str2 = "   *   ";
                    } else if (i == 4) {
                        str2 = "  *    ";
                    } else if (i == 5) {
                        str2 = " *     ";
                    } else if (i == 6) {
                        str2 = " ***** ";
                    }
                } else if (number == 3) {
                    if (i == 0) {
                        str3 = "  ***  ";
                    } else if (i == 1) {
                        str3 = " *   * ";
                    } else if (i == 2) {
                        str3 = "     * ";
                    } else if (i == 3) {
                        str3 = "  ***  ";
                    } else if (i == 4) {
                        str3 = "     * ";
                    } else if (i == 5) {
                        str3 = " *   * ";
                    } else if (i == 6) {
                        str3 = "  ***  ";
                    }
                } else if (number == 4) {
                    if (i == 0) {
                        str4 = "    *   ";
                    } else if (i == 1) {
                        str4 = "   **   ";
                    } else if (i == 2) {
                        str4 = "  * *   ";
                    } else if (i == 3) {
                        str4 = " *  *   ";
                    } else if (i == 4) {
                        str4 = " ****** ";
                    } else if (i == 5) {
                        str4 = "    *   ";
                    } else if (i == 6) {
                        str4 = "    *   ";
                    }
                } else if (number == 5) {
                    if (i == 0) {
                        str5 = " ***** ";
                    } else if (i == 1) {
                        str5 = " *     ";
                    } else if (i == 2) {
                        str5 = " *     ";
                    } else if (i == 3) {
                        str5 = " ****  ";
                    } else if (i == 4) {
                        str5 = "     * ";
                    } else if (i == 5) {
                        str5 = " *   * ";
                    } else if (i == 6) {
                        str5 = "  ***  ";
                    }
                } else if (number == 6) {
                    if (i == 0) {
                        str6 = "  **** ";
                    } else if (i == 1) {
                        str6 = " *     ";
                    } else if (i == 2) {
                        str6 = " *     ";
                    } else if (i == 3) {
                        str6 = " ****  ";
                    } else if (i == 4) {
                        str6 = " *   * ";
                    } else if (i == 5) {
                        str6 = " *   * ";
                    } else if (i == 6) {
                        str6 = "  ***  ";
                    }
                } else if (number == 7) {
                    if (i == 0) {
                        str7 = " ***** ";
                    } else if (i == 1) {
                        str7 = "     * ";
                    } else if (i == 2) {
                        str7 = "    *  ";
                    } else if (i == 3) {
                        str7 = "   *   ";
                    } else if (i == 4) {
                        str7 = "  *    ";
                    } else if (i == 5) {
                        str7 = " *     ";
                    } else if (i == 6) {
                        str7 = " *     ";
                    }
                } else if (number == 8) {
                    if (i == 0) {
                        str8 = "  ***  ";
                    } else if (i == 1) {
                        str8 = " *   * ";
                    } else if (i == 2) {
                        str8 = " *   * ";
                    } else if (i == 3) {
                        str8 = "  ***  ";
                    } else if (i == 4) {
                        str8 = " *   * ";
                    } else if (i == 5) {
                        str8 = " *   * ";
                    } else if (i == 6) {
                        str8 = "  ***  ";
                    }
                } else if (number == 9) {
                    if (i == 0) {
                        str9 = "  ***  ";
                    } else if (i == 1) {
                        str9 = " *   * ";
                    } else if (i == 2) {
                        str9 = " *   * ";
                    } else if (i == 3) {
                        str9 = "  **** ";
                    } else if (i == 4) {
                        str9 = "     * ";
                    } else if (i == 5) {
                        str9 = "     * ";
                    } else if (i == 6) {
                        str9 = " ****  ";
                    }
                }

                strFull = strFull + str + str1 + str2 + str3 + str4 + str5 + str6 + str7 + str8 + str9;
                str = "";
                str1 = "";
                str2 = "";
                str3 = "";
                str4 = "";
                str5 = "";
                str6 = "";
                str7 = "";
                str8 = "";
                str9 = "";
            }
            System.out.println(strFull);
            strFull = "";
        }
    }
}
