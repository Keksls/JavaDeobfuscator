/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.commons.lang3.ArrayUtils
 */
import java.nio.ByteBuffer;
import org.apache.commons.lang3.ArrayUtils;

public class clg
extends Pw {
    private ael_2 a;
    private afm_0 b = afm_0.p;

    @Override
    public byte[] b() {
        if (this.a == null) {
            return null;
        }
        ByteBuffer byteBuffer = ByteBuffer.allocate(4);
        byteBuffer.putInt(this.b.a());
        byte[] byArray = ArrayUtils.addAll((byte[])byteBuffer.array(), (byte[])this.a.c());
        return this.a((byte)3, byArray);
    }

    @Override
    public int a() {
        return 13885;
    }

    public ael_2 c() {
        return this.a;
    }

    public void a(ael_2 ael_22) {
        this.a = ael_22;
    }

    public void a(afm_0 afm_02) {
        this.b = afm_02;
    }
}

