/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.ankamagames.steam.common.AuthTicket
 */
import com.ankamagames.steam.common.AuthTicket;

/*
 * Renamed from ckE
 */
public class cke_1
extends Pw {
    private long a;
    private AuthTicket b;

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.b(this.b.serialize());
        return this.a((byte)8, abx_22.c());
    }

    @Override
    public int a() {
        return 471;
    }

    public void a(long l) {
        this.a = l;
    }

    public void a(AuthTicket authTicket) {
        this.b = authTicket;
    }
}

