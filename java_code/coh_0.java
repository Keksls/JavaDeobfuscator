/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from coh
 */
public class coh_0
extends Pw {
    private String a = "";
    private final List<eye_2> b = new ArrayList<eye_2>();

    public void a(long l, short s2, short s3) {
        this.b.add(new eye_2(l, s2, s3));
    }

    public void a(String string) {
        this.a = string;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        byte[] byArray = Cz.a(this.a);
        abx_22.a((byte)byArray.length);
        abx_22.b(byArray);
        abx_22.a(this.b.size());
        this.b.forEach(eye_22 -> {
            abx_22.a(eye_22.a());
            abx_22.a(eye_22.b());
            abx_22.a(eye_22.c());
        });
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12064;
    }
}

