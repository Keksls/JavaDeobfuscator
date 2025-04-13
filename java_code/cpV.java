/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class cpV
extends Pw {
    private byte[] a;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a.length);
        abx_22.b(this.a);
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12152;
    }

    public void a(@NotNull dw_1 dw_12) {
        this.a = dw_12.toByteArray();
    }
}

