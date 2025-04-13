/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.common.AuthTicket
 */
import com.ankamagames.steam.common.AuthTicket;

/*
 * Renamed from ckI
 */
public class cki_1
extends Pw {
    private byte[] a;
    private long b = -1L;
    private AuthTicket c;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a.length);
        abx_22.b(this.a);
        abx_22.a(this.b);
        abx_22.b(this.c.serialize());
        return this.a((byte)8, abx_22.c());
    }

    @Override
    public int a() {
        return 458;
    }

    public void a(byte[] byArray) {
        this.a = (byte[])byArray.clone();
    }

    public void a(long l) {
        this.b = l;
    }

    public void a(AuthTicket authTicket) {
        this.c = authTicket;
    }
}

