/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

public class IB
implements FileFilter {
    private final String a;

    public IB(String string) {
        this.a = string;
    }

    @Override
    public boolean accept(File file) {
        String string = file.getName();
        return Pattern.matches(this.a, string);
    }
}

