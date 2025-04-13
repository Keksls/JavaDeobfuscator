/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from cxO
 */
public class cxo_2
extends ps_0 {
    private fhe_0 a;

    @Override
    public boolean a(byte[] byArray) {
        this.a = fhm.a(ByteBuffer.wrap(byArray));
        return true;
    }

    public fhe_0 b() {
        return this.a;
    }

    @Override
    public int a() {
        return 12465;
    }
}

