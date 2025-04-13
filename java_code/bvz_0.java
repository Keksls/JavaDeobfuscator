/*
 * Decompiled with CFR 0.152.
 */
import java.io.File;
import java.io.FileFilter;
import java.util.regex.Pattern;

/*
 * Renamed from bVZ
 */
class bvz_0
implements FileFilter {
    private final Pattern b = Pattern.compile("(accountPreferences|characterPreferences).*(.properties)");
    final /* synthetic */ bvx_0 a;

    bvz_0(bvx_0 bvx_02) {
        this.a = bvx_02;
    }

    private boolean a(String string) {
        return string.length() > 0 && this.b.matcher(string).matches();
    }

    @Override
    public boolean accept(File file) {
        return file.isDirectory() || this.a(file.getName());
    }
}

