/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class WN {
    private static final Logger a = Logger.getLogger(WN.class);

    public static wt_0 a(@NotNull String string, @NotNull String string2) {
        if (!wm_0.a(string, string2)) {
            throw new WP(string, string2);
        }
        int n = 0;
        int n2 = 1;
        int n3 = 1;
        int n4 = 0;
        int n5 = 0;
        int n6 = 0;
        char[] cArray = string.toCharArray();
        int n7 = 0;
        int n8 = 0;
        while (n7 < cArray.length) {
            String string3;
            char c2 = cArray[n7++];
            int n9 = n8++;
            if (c2 != WQ.a.a()) continue;
            c2 = cArray[n7++];
            if (n7 < cArray.length) {
                int n10 = string2.indexOf(cArray[n7], n8);
                string3 = string2.substring(n9, n10);
            } else {
                string3 = string2.substring(n9);
            }
            n8 += string3.length();
            WQ wQ = WQ.i.get(Character.valueOf(c2));
            switch (wQ) {
                case b: {
                    String string4 = wq_0.getInstance().get(1) / 100 + string3;
                    n = Integer.parseInt(string4);
                    break;
                }
                case c: {
                    n = Integer.parseInt(string3);
                    break;
                }
                case d: {
                    n2 = Integer.parseInt(string3);
                    break;
                }
                case e: {
                    n3 = Integer.parseInt(string3);
                    break;
                }
                case f: {
                    n4 = Integer.parseInt(string3);
                    break;
                }
                case g: {
                    n5 = Integer.parseInt(string3);
                    break;
                }
                case h: {
                    n6 = Integer.parseInt(string3);
                }
            }
            ++n7;
        }
        return new wt_0(n6, n5, n4, n3, n2, n);
    }

    public static String a(@NotNull String string, @NotNull wu_0 wu_02) {
        StringBuilder stringBuilder = new StringBuilder();
        char[] cArray = string.toCharArray();
        int n = 0;
        for (int k = 0; k < cArray.length; ++k) {
            if (cArray[k] != '%') continue;
            if (k != n) {
                stringBuilder.append(cArray, n, k - n);
            }
            if (++k == cArray.length) {
                n = cArray.length;
                break;
            }
            char c2 = cArray[k];
            WQ wQ = WQ.i.get(Character.valueOf(c2));
            switch (wQ) {
                case b: {
                    stringBuilder.append(wu_02.o() % 100);
                    break;
                }
                case c: {
                    stringBuilder.append(wu_02.o());
                    break;
                }
                case d: {
                    int n2 = wu_02.m();
                    if (n2 < 10) {
                        stringBuilder.append('0');
                    }
                    stringBuilder.append(n2);
                    break;
                }
                case e: {
                    int n2 = wu_02.j();
                    if (n2 < 10) {
                        stringBuilder.append('0');
                    }
                    stringBuilder.append(n2);
                    break;
                }
                case f: {
                    int n2 = wu_02.k();
                    if (n2 < 10) {
                        stringBuilder.append('0');
                    }
                    stringBuilder.append(n2);
                    break;
                }
                case g: {
                    int n2 = wu_02.l();
                    if (n2 < 10) {
                        stringBuilder.append('0');
                    }
                    stringBuilder.append(n2);
                    break;
                }
                case h: {
                    int n2 = wu_02.n();
                    if (n2 < 10) {
                        stringBuilder.append('0');
                    }
                    stringBuilder.append(n2);
                    break;
                }
                case a: {
                    stringBuilder.append(WQ.a.a());
                    break;
                }
                default: {
                    a.warn((Object)("Caract\u00e8re de formattage inconnu '" + c2 + "' dans la chaine " + string));
                }
            }
            n = k + 1;
        }
        stringBuilder.append(cArray, n, cArray.length - n);
        return stringBuilder.toString();
    }
}

