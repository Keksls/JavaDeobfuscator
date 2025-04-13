/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.File;
import java.net.URL;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from asT
 */
public class ast_1 {
    private final File a;
    private final URL b;

    ast_1(@NotNull URL uRL, @NotNull File file) {
        this.a = file;
        this.b = uRL;
    }

    public File a() {
        return this.a;
    }

    public boolean b() {
        return this.a != null && this.a.isFile();
    }

    URL c() {
        return this.b;
    }
}

