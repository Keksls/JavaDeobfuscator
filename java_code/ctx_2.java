/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import java.nio.ByteBuffer;
import org.jetbrains.annotations.Nullable;

/*
 * Renamed from ctX
 */
public class ctx_2
extends ctj_2 {
    private long c;
    private byte d;
    private apl_1 e;
    private byte f;

    @Override
    public boolean a(byte[] byArray) {
        if (!this.a(byArray.length, 20, false)) {
            return false;
        }
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.b(byteBuffer);
        this.c = byteBuffer.getLong();
        this.d = byteBuffer.get();
        this.f = byteBuffer.get();
        int n = byArray.length - 22;
        byte[] byArray2 = new byte[n];
        byteBuffer.get(byArray2);
        this.e = new apl_1(byArray2);
        return true;
    }

    @Override
    public int a() {
        return 13211;
    }

    public long g() {
        return this.c;
    }

    public byte h() {
        return this.d;
    }

    @Override
    public int b() {
        return 0;
    }

    @Override
    public emd_1 c() {
        return emd_1.i;
    }

    public apl_1 i() {
        return this.e;
    }

    @Nullable
    public emu_2 j() {
        return emu_2.a(this.f);
    }
}

