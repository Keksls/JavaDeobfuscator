/*
 * Decompiled with CFR 0.152.
 */
import java.util.regex.Pattern;

enum Cj {
    a(Pattern.compile(String.format("[%s]+", Character.valueOf('\uff03'))), "#"),
    b(Pattern.compile(String.format("[%s]+", Character.valueOf('\u00a0'))), " "),
    c(Pattern.compile(String.format("[%s]+", Character.valueOf('\u2026'))), "..."),
    d(Pattern.compile(String.format("[%s]+", Character.valueOf('\u2018'))), "'"),
    e(Pattern.compile(String.format("[%s]+", Character.valueOf('\u2019'))), "'"),
    f(Pattern.compile(String.format("[%s]+", Character.valueOf('\u201c'))), "\""),
    g(Pattern.compile(String.format("[%s]+", Character.valueOf('\u201d'))), "\""),
    h(Pattern.compile(String.format("%s\\s*", Character.valueOf('\u00ab'))), "\""),
    i(Pattern.compile(String.format("\\s*%s", Character.valueOf('\u00bb'))), "\"");

    final Pattern j;
    final String k;

    private Cj(Pattern pattern, String string2) {
        this.j = pattern;
        this.k = string2;
    }
}

