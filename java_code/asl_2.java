/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FilenameFilter;
import java.util.regex.Pattern;

/*
 * Renamed from asL
 */
public class asl_2
implements FilenameFilter {
    private final Pattern a;

    public asl_2(Pattern pattern) {
        if (pattern == null) {
            throw new IllegalArgumentException("Pattern null");
        }
        this.a = pattern;
    }

    @Override
    public boolean accept(File file, String string) {
        return this.a.matcher(string).matches();
    }
}

