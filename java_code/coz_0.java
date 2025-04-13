/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from coZ
 */
public class coz_0
extends cpf_0 {
    private no a;

    @Override
    protected void a(ByteBuffer byteBuffer) {
        byte[] byArray = new byte[byteBuffer.getInt()];
        byteBuffer.get(byArray);
        this.a = no.a(byArray);
    }

    @Override
    public int a() {
        return 12801;
    }

    public no b() {
        return this.a;
    }
}

