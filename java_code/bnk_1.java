/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  jakarta.xml.bind.DatatypeConverter
 */
import jakarta.xml.bind.DatatypeConverter;
import java.io.IOException;

/*
 * Renamed from bnk
 */
final class bnk_1
extends eqk_2 {
    private final ov_1 b;
    final /* synthetic */ bnh_1 a;

    bnk_1(bnh_1 bnh_12, ov_1 ov_12) {
        this.a = bnh_12;
        this.b = ov_12;
        this.b.a().a(this);
    }

    @Override
    public void a() {
        bnh_1.fA().error((Object)"Les achievements ne sont pas serialis\u00e9s par le client");
    }

    @Override
    public void b() {
        bhr_1 bhr_12 = bhp_1.a.a();
        try {
            bhr_12.a(this.b.d ? flI.b(this.b.c) : this.b.c);
        }
        catch (IOException iOException) {
            String string = DatatypeConverter.printHexBinary((byte[])this.b.c);
            bnh_1.fB().fatal((Object)("Error unserializing achievements, hex : " + string), (Throwable)iOException);
        }
        bhr_12.a(new bmn_1(bnh_1.c(this.a), bhr_12));
        bhl_1.a.a(this.a.a_(), bhr_12);
        this.b.c = null;
    }
}

