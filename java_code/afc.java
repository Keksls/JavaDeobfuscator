/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.apache.log4j.Logger
 *  org.jetbrains.annotations.NotNull
 */
import org.apache.log4j.Logger;
import org.jetbrains.annotations.NotNull;

public class afc
implements qu_0 {
    private static final Logger g = Logger.getLogger(afc.class);
    public long a;
    public short b;
    public int[] c;
    public byte[] d;
    public boolean e;
    public short f = (short)-1;

    @Override
    public void a(@NotNull arf_1 arf_12) {
        this.a = arf_12.j();
        this.b = arf_12.b();
        int n = arf_12.a() & 0xFF;
        this.c = arf_12.c(n);
        int n2 = arf_12.b() & 0xFFFF;
        this.d = arf_12.a(n2);
        this.e = arf_12.l();
        this.f = arf_12.b();
    }

    @Override
    public void a(@NotNull gk_0 gk_02) {
        gk_02.c(this.a);
        gk_02.a(this.b);
        if (this.c == null) {
            gk_02.a((byte)0);
        } else {
            gk_02.a((byte)(this.c.length & 0xFF));
            for (int k = 0; k < this.c.length; ++k) {
                gk_02.a(this.c[k]);
            }
        }
        gk_02.a((short)(this.d.length & 0xFFFF));
        gk_02.a(this.d);
        gk_02.a(this.e);
        gk_02.a(this.f);
        gk_02.c();
    }
}

