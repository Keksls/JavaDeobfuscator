/*
 * Decompiled with CFR 0.152.
 */
import java.io.DataInputStream;
import java.io.InputStream;

/*
 * Renamed from asj
 */
final class asj_1
extends DataInputStream {
    private final ask_1 a = new ask_1(null);

    public asj_1() {
        super(null);
        this.in = this.a;
    }

    public final void a(InputStream inputStream) {
        this.a.a(inputStream);
    }

    @Override
    public void close() {
        this.a.close();
    }
}

