/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.InvalidProtocolBufferException
 */
import com.google.protobuf.InvalidProtocolBufferException;

/*
 * Renamed from bnl
 */
final class bnl_1
extends eqk_2 {
    private final pe_2 b;
    final /* synthetic */ bnh_1 a;

    bnl_1(bnh_1 bnh_12, pe_2 pe_22) {
        this.a = bnh_12;
        this.b = pe_22;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        this.b.c = this.a.cv.o();
    }

    @Override
    public void b() {
        eb eb2;
        for (eql_2 eql_22 : bnh_1.a(this.a)) {
            eql_22.a(this.a);
        }
        try {
            eb2 = eb.a(this.b.c);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bnh_1.fn().error((Object)("Error when unserializing appearance for character id=" + this.a.a_()), (Throwable)invalidProtocolBufferException);
            return;
        }
        this.a.g((byte)eb2.y());
        this.a.a(eb2.c(), true);
        this.a.b(eb2.e(), true);
        this.a.c(eb2.g(), true);
        this.a.a(atm_1.k, eb2.i(), true);
        this.a.a(atm_1.l, eb2.k(), true);
        this.a.a(atm_1.m, eb2.m(), true);
        this.a.a(atm_1.n, eb2.o(), true);
        this.a.a(atm_1.o, eb2.q(), true);
        this.a.a(atm_1.p, eb2.s(), true);
        this.a.aO();
        this.a.a((byte)eb2.u(), false);
        this.a.b((byte)eb2.w(), false);
        this.a.aP();
    }
}

