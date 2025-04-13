/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from aHO
 */
public final class aho_2 {
    private static final int b;
    private static final String[] c;
    private static final String[] d;
    public static boolean a;

    private aho_2() {
    }

    public static String a(Throwable throwable) {
        return aho_2.a(throwable, Integer.MAX_VALUE);
    }

    public static String a(Throwable throwable, int n) {
        if (throwable == null) {
            return " [null Throwable in ExceptionFormatter.toString()]";
        }
        StackTraceElement[] stackTraceElementArray = throwable.getStackTrace();
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(' ').append(throwable.toString());
        if (stackTraceElementArray.length == 0) {
            stringBuilder.append("emptyStacktrace, current is ").append(aho_2.a(n));
        } else {
            stringBuilder.append(aho_2.a(stackTraceElementArray, 0, n));
        }
        if (throwable.getCause() != null) {
            stringBuilder.append(" caused by ").append(aho_2.a(throwable.getCause(), n));
        }
        return stringBuilder.toString();
    }

    public static String a() {
        return aho_2.a(1, Integer.MAX_VALUE);
    }

    public static String a(int n) {
        return aho_2.a(1, n);
    }

    public static String a(int n, int n2) {
        StackTraceElement[] stackTraceElementArray = Thread.currentThread().getStackTrace();
        return aho_2.a(stackTraceElementArray, 2 + b + n, n2);
    }

    private static String a(StackTraceElement[] stackTraceElementArray, int n, int n2) {
        StringBuilder stringBuilder = new StringBuilder("stackTrace=");
        aho_2.a(stringBuilder, stackTraceElementArray, n, n2, ' ');
        return stringBuilder.toString();
    }

    private static void a(StringBuilder stringBuilder, StackTraceElement[] stackTraceElementArray, int n, int n2, char c2) {
        for (int k = n; k < stackTraceElementArray.length && k - n < n2; ++k) {
            aho_2.a(stringBuilder, stackTraceElementArray[k], c2);
        }
    }

    private static StringBuilder a(StringBuilder stringBuilder, StackTraceElement stackTraceElement, char c2) {
        return stringBuilder.append(' ').append(aho_2.a(stackTraceElement.getClassName())).append('.').append(stackTraceElement.getMethodName()).append('(').append(stackTraceElement.getFileName()).append(':').append(stackTraceElement.getLineNumber()).append(')').append(c2);
    }

    static String a(String string) {
        if (!a) {
            return string;
        }
        Object object = aho_2.b(string);
        for (int k = 0; k < c.length; ++k) {
            String string2 = c[k];
            if (!string.startsWith(string2)) continue;
            object = "[" + d[k] + "]" + (String)object;
            break;
        }
        return object;
    }

    private static String b(String string) {
        int n = string.lastIndexOf(46);
        return n == -1 ? string : string.substring(n + 1);
    }

    static {
        String string = Thread.currentThread().getStackTrace()[0].getMethodName();
        b = "getStackTrace".equals(string) ? 0 : 1;
        c = new String[]{"com.ankamagames.wakfu.server.game", "com.ankamagames.wakfu.server.ia", "com.ankamagames.wakfu.server", "com.ankamagames.wakfu.client", "com.ankamagames.wakfu.common", "com.ankamagames.baseImpl", "com.ankamagames.framework"};
        d = new String[]{"GAME", "IA", "SRV", "CLI", "COMM", "BIMP", "FWK"};
        a = true;
    }
}

