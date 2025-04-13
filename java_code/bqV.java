/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public final class bqV {
    private bqV() {
    }

    @NotNull
    public static bmv_1 a(eBt eBt2) {
        short s2 = eBx.b(eBt2);
        bmv_1 bmv_12 = bmv_1.cy();
        bmv_12.g(false);
        bmv_12.a_(s2);
        bmv_12.c(bpc_1.a().a(eBt2.a()));
        bmv_12.o(eBt2.f());
        bmv_12.h((byte)5);
        bmv_12.h(eBt2.b());
        bmv_12.c(eBt2.e());
        return bmv_12;
    }

    public static String b(eBt eBt2) {
        String string = eBt2.e();
        if (string != null && !string.isBlank()) {
            return string;
        }
        return bae.h().a(7, (long)eBt2.a(), new Object[0]);
    }
}

