/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;

/*
 * Renamed from eMo
 */
class emo_2
implements emp_1 {
    final /* synthetic */ short a;
    final /* synthetic */ short b;

    emo_2(short s2, short s3) {
        this.a = s2;
        this.b = s3;
    }

    @Override
    public yx_0 a(short s2, short s3) {
        try {
            yz_0.a((long)this.a, s2, s3);
            return yz_0.b((long)this.a, s2, s3, this.b);
        }
        catch (IOException iOException) {
            eml_2.b.error((Object)("Unable to load map (" + s2 + "; " + s3 + ")"));
            return null;
        }
    }
}

