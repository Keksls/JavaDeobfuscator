/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.net.URL;
import org.jetbrains.annotations.NotNull;

/*
 * Renamed from aIC
 */
public class aic_2
extends ait_1 {
    private static final int a = 1024;
    private final ByteArrayOutputStream b = new ByteArrayOutputStream(1024);

    public aic_2(@NotNull URL uRL) {
        super(uRL);
    }

    @Override
    OutputStream d() {
        return this.b;
    }

    @Override
    boolean a(boolean bl) {
        return bl;
    }

    public byte[] g() {
        return this.b.toByteArray();
    }

    public String h() {
        return this.b.toString("UTF-8");
    }

    public String a(String string) {
        return this.b.toString(string);
    }

    @Override
    protected String f() {
        return "Memory";
    }
}

