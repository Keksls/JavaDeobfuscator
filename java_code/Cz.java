/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Sets
 *  org.jetbrains.annotations.Contract
 *  org.jetbrains.annotations.NotNull
 *  org.jetbrains.annotations.Nullable
 */
import com.google.common.collect.Sets;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.text.DecimalFormat;
import java.text.Normalizer;
import java.text.StringCharacterIterator;
import java.util.Base64;
import java.util.Date;
import java.util.HashSet;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public abstract class Cz {
    public static final char a = '=';
    public static final char b = '-';
    private static final DecimalFormat d = new DecimalFormat("###,###");
    private static final String e = "0123456789abcdef";

    public static byte[] a(String string) {
        if (string == null) {
            return Cn.b;
        }
        try {
            return string.getBytes("UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return string.getBytes();
        }
    }

    public static String a(byte[] byArray) {
        return Cz.a(byArray, 0, byArray.length);
    }

    @Nullable
    public static String a(byte[] byArray, int n, int n2) {
        if (byArray == null) {
            return null;
        }
        if (n2 == 0) {
            return "";
        }
        try {
            return new String(byArray, n, n2, "UTF-8");
        }
        catch (UnsupportedEncodingException unsupportedEncodingException) {
            return new String(byArray);
        }
    }

    public static String a(ByteBuffer byteBuffer) {
        short s2 = byteBuffer.getShort();
        if (byteBuffer.remaining() < s2) {
            throw new BufferUnderflowException();
        }
        byte[] byArray = new byte[s2];
        byteBuffer.get(byArray);
        return Cz.a(byArray);
    }

    @NotNull
    public static String b(ByteBuffer byteBuffer) {
        byte by = byteBuffer.get();
        if (byteBuffer.remaining() < by) {
            throw new BufferUnderflowException();
        }
        byte[] byArray = new byte[by];
        byteBuffer.get(byArray);
        return Cz.a(byArray);
    }

    @Contract(value="!null -> !null;null -> null")
    public static String b(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }

    @Contract(value="!null -> !null;null -> null")
    public static String c(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        return string.substring(0, 1).toUpperCase() + string.substring(1).toLowerCase();
    }

    public static String d(String string) {
        char[] cArray = string.trim().toLowerCase().toCharArray();
        boolean bl = false;
        int n = cArray.length;
        for (int k = 0; k < n; ++k) {
            if (Character.isLetter(cArray[k])) {
                if (bl) continue;
                cArray[k] = Character.toUpperCase(cArray[k]);
                bl = true;
                continue;
            }
            bl = false;
        }
        return String.valueOf(cArray);
    }

    public static boolean a(@NotNull String string, @NotNull String string2) {
        return Cz.e(string).contains(Cz.e(string2));
    }

    @Contract(value="!null -> !null;null -> null")
    public static String e(String string) {
        if (string == null) {
            return null;
        }
        return Cz.o(string).trim();
    }

    public static String a(int n, int n2) {
        return Cz.b(String.valueOf(n), n2);
    }

    private static String b(String string, int n) {
        StringBuilder stringBuilder = new StringBuilder(n);
        for (int k = 0; k < n - string.length(); ++k) {
            stringBuilder.append('0');
        }
        stringBuilder.append(string);
        return stringBuilder.toString();
    }

    public static String a(long l) {
        Date date = new Date(l);
        String string = date.getDate() + "/" + (date.getMonth() + 1) + "/" + (date.getYear() + 1900);
        String string2 = (Serializable)(date.getHours() < 10 ? "0" + date.getHours() : Integer.valueOf(date.getHours())) + ":" + (Serializable)(date.getMinutes() < 10 ? "0" + date.getMinutes() : Integer.valueOf(date.getMinutes()));
        return string + " \u00e0 " + string2;
    }

    public static boolean f(String string) {
        return string == null || string.trim().isEmpty() || "null".equals(string);
    }

    public static boolean g(String string) {
        return !Cz.f(string) && Pattern.matches("^[-]?\\d+$", string);
    }

    public static boolean h(String string) {
        return !Cz.f(string) && Pattern.matches("^[-]?((\\d+([.]\\d*)?)|(\\d*([.]\\d+)?))$", string);
    }

    public static String i(String string) {
        return string.replaceAll("&(?!amp;|quot;|apos;|lt;|gt;|#\\d+;)", "&amp;").replaceAll("\"", "&quot;").replaceAll("'", "&apos;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
    }

    public static int a(char c2, String string) {
        int n = 0;
        int n2 = string.length();
        for (int k = 0; k < n2; ++k) {
            if (string.charAt(k) != c2) continue;
            ++n;
        }
        return n;
    }

    public static int a(char c2, char[] cArray) {
        int n = 0;
        for (char c3 : cArray) {
            if (c3 != c2) continue;
            ++n;
        }
        return n;
    }

    public static boolean a(String string, String string2, boolean bl) {
        if (bl) {
            if (Cz.f(string)) {
                return Cz.f(string2);
            }
        } else {
            if (string == null) {
                return string2 == null;
            }
            if (string2 == null) {
                return false;
            }
        }
        return string.equals(string2);
    }

    public static boolean b(@NotNull String string, @NotNull String string2) {
        return Cz.e(string).equals(Cz.e(string2));
    }

    public static int c(String string, String string2) {
        if (string == null) {
            return string2 == null ? 0 : "".compareTo(string2);
        }
        return string.compareTo(string2 == null ? "" : string2);
    }

    public static int d(String string, String string2) {
        return CA.a.a(string, string2);
    }

    public static String j(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        StringCharacterIterator stringCharacterIterator = new StringCharacterIterator(string);
        char c2 = stringCharacterIterator.current();
        while (c2 != '\uffff') {
            if (c2 == '<') {
                stringBuilder.append("&lt;");
            } else if (c2 == '>') {
                stringBuilder.append("&gt;");
            } else if (c2 == '\"') {
                stringBuilder.append("&quot;");
            } else if (c2 == '\'') {
                stringBuilder.append("&#039;");
            } else if (c2 == '&') {
                stringBuilder.append("&amp;");
            } else {
                stringBuilder.append(c2);
            }
            c2 = stringCharacterIterator.next();
        }
        return stringBuilder.toString();
    }

    public static String b(byte[] byArray) {
        StringBuilder stringBuilder = new StringBuilder(byArray.length * 2);
        for (byte by : byArray) {
            int n = by & 0xFF;
            stringBuilder.append(e.charAt(n >>> 4)).append(e.charAt(n & 0xF));
        }
        return stringBuilder.toString();
    }

    public static byte[] k(String string) {
        int n = string.length();
        if (n % 2 != 0) {
            throw new IllegalArgumentException("hexBinary needs to be even-length: " + string);
        }
        byte[] byArray = new byte[n / 2];
        for (int k = 0; k < n; k += 2) {
            int n2 = Cz.a(string.charAt(k));
            int n3 = Cz.a(string.charAt(k + 1));
            if (n2 == -1 || n3 == -1) {
                throw new IllegalArgumentException("contains illegal character for hexBinary: " + string);
            }
            byArray[k / 2] = (byte)(n2 * 16 + n3);
        }
        return byArray;
    }

    private static int a(char c2) {
        if (c2 >= '0' && c2 <= '9') {
            return c2 - 48;
        }
        if (c2 >= 'A' && c2 <= 'F') {
            return c2 - 65 + 10;
        }
        if (c2 >= 'a' && c2 <= 'f') {
            return c2 - 97 + 10;
        }
        return -1;
    }

    public static String a(int n) {
        return d.format(n);
    }

    @Deprecated
    public static String a(int[] nArray) {
        if (nArray.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < nArray.length - 1; ++k) {
            stringBuilder.append(nArray[k]).append(',');
        }
        stringBuilder.append(nArray[nArray.length - 1]);
        return stringBuilder.toString();
    }

    @Deprecated
    public static String a(String[] stringArray, char c2) {
        if (stringArray.length == 0) {
            return "";
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int k = 0; k < stringArray.length - 1; ++k) {
            stringBuilder.append(stringArray[k]).append(c2);
        }
        stringBuilder.append(stringArray[stringArray.length - 1]);
        return stringBuilder.toString();
    }

    public static int[] l(@NotNull String string) {
        Object[] objectArray = Cn.a(Cz.m(string));
        HashSet hashSet = Sets.newHashSet((Object[])objectArray);
        return Cn.a(hashSet.toArray(new Integer[hashSet.size()]));
    }

    public static int[] m(@NotNull String string) {
        String[] stringArray;
        if (string.isEmpty()) {
            return Cn.f;
        }
        HashSet<Integer> hashSet = new HashSet<Integer>();
        for (String string2 : stringArray = Cz.a(string, ',')) {
            hashSet.add(Integer.parseInt(string2.trim()));
        }
        return Cn.a(hashSet.toArray(new Integer[hashSet.size()]));
    }

    public static String a(String string, String string2, Object object) {
        int n = string.indexOf(string2);
        return string.substring(0, n) + object + string.substring(n + string2.length());
    }

    public static String[] e(String string, String string2) {
        assert (string != null);
        if (string.isEmpty()) {
            return new String[]{""};
        }
        return string.split(Pattern.quote(string2));
    }

    public static String[] a(String string, char c2) {
        assert (string != null);
        if (string.isEmpty()) {
            return new String[]{""};
        }
        return string.split(Pattern.quote(String.valueOf(c2)));
    }

    public static String a(String string, int n) {
        String string2 = string;
        do {
            byte[] byArray;
            if ((byArray = Cz.a(string2)).length <= n) {
                return string2;
            }
            string2 = string2.substring(0, string2.length() - 1);
        } while (!string2.isEmpty());
        return "";
    }

    public static String n(String string) {
        if (string.isEmpty()) {
            return string;
        }
        return string.length() == 1 ? String.valueOf(Character.toUpperCase(string.charAt(0))) : Character.toUpperCase(string.charAt(0)) + string.substring(1).toLowerCase();
    }

    public static String o(String string) {
        return Normalizer.normalize(string, Normalizer.Form.NFD).toLowerCase().replaceAll("\\p{InCombiningDiacriticalMarks}+", "").replace("\u0153", "oe").replace("\u00e6", "ae").replace("\u2014", "-");
    }

    public static String p(@NotNull String string) {
        return string.replaceAll("[^a-zA-Z0-9]", "");
    }

    @NotNull
    @Contract(pure=true)
    public static String q(@NotNull String string) {
        return string.replaceAll("[\\x00-\\x1F]", "");
    }

    public static String c(byte[] byArray) {
        String string = Base64.getEncoder().withoutPadding().encodeToString(byArray) + "=";
        StringBuilder stringBuilder = new StringBuilder();
        char c2 = string.charAt(0);
        int n = 1;
        for (int k = 1; k < string.length(); ++k) {
            if (string.charAt(k) == c2) {
                if (++n == 35) {
                    stringBuilder.append('-').append(Integer.toString(n, 36)).append(c2);
                    n = 0;
                }
            } else {
                if (n < 4) {
                    stringBuilder.append(string, k - n, k);
                } else {
                    stringBuilder.append('-').append(Integer.toString(n, 36)).append(c2);
                }
                n = 1;
            }
            c2 = string.charAt(k);
        }
        return stringBuilder.toString();
    }

    public static byte[] r(String string) {
        StringBuilder stringBuilder = new StringBuilder();
        int n = 0;
        while (n < string.length()) {
            if (string.charAt(n) == '-') {
                int n2 = Integer.parseInt(String.valueOf(string.charAt(n + 1)), 36);
                char c2 = string.charAt(n + 2);
                stringBuilder.append(String.valueOf(c2).repeat(n2));
                n += 3;
                continue;
            }
            stringBuilder.append(string.charAt(n));
            ++n;
        }
        return Base64.getDecoder().decode(stringBuilder.toString());
    }

    public static boolean s(String string) {
        try {
            Pattern.compile(string);
            return true;
        }
        catch (PatternSyntaxException patternSyntaxException) {
            return false;
        }
    }

    public static boolean t(@Nullable String string) {
        return string != null && !string.isEmpty();
    }

    @Contract(value="null -> null;!null -> !null")
    public static String u(String string) {
        if (string == null) {
            return null;
        }
        return string.replaceAll("\n", ", ").replaceAll("\\s{2,}", " ");
    }
}

