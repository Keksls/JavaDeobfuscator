/*
 * Decompiled with CFR 0.152.
 */
import java.util.Optional;
import java.util.stream.Collectors;

/*
 * Renamed from aWz
 */
public class awz_0
extends aXj {
    public static final int a = 0;
    public static final int b = 1;
    public static final int c = 2;
    public static final int d = 3;
    public static final int e = 4;
    private final int f;
    private final int g;

    public awz_0(int n) {
        this.f = n;
        this.g = -1;
    }

    public awz_0(int n, int n2) {
        this.f = n;
        this.g = n2;
    }

    @Override
    public boolean a() {
        return this.f >= 0 && this.f <= 4;
    }

    @Override
    public void b() {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 == null) {
            aVo.a().d("Requires to be connected!");
            return;
        }
        try {
            switch (this.f) {
                case 0: {
                    Pt pt = new Pt();
                    pt.a((short)182);
                    pt.a(this.g);
                    pt.a((byte)3);
                    aaw_22.c(pt);
                    break;
                }
                case 1: {
                    Pt pt = new Pt();
                    pt.a((short)216);
                    pt.a((byte)3);
                    aaw_22.c(pt);
                    break;
                }
                case 2: {
                    Pt pt = new Pt();
                    pt.a((short)101);
                    pt.a(this.g);
                    pt.a((byte)3);
                    aaw_22.c(pt);
                    break;
                }
                case 3: {
                    Pt pt = new Pt();
                    pt.a((short)371);
                    pt.a((byte)3);
                    aaw_22.c(pt);
                    break;
                }
                case 4: {
                    bmr_1 bmr_12 = azu_0.j().k();
                    if (bmr_12 == null) {
                        awz_0.c("Unable to fetch local player. Cannot proceed with the command.");
                        return;
                    }
                    long l = bmr_12.U_();
                    Optional optional = ena_0.a().b(l, end_0.k);
                    if (optional.isEmpty()) {
                        awz_0.c("Unable to fetch account data for " + l);
                        return;
                    }
                    ffd ffd2 = (ffd)optional.get();
                    String string = ffd2.a().stream().map(Object::toString).collect(Collectors.joining(","));
                    awz_0.a("Known furniture : " + string);
                }
            }
        }
        catch (Exception exception) {
            aVo.a().d("Command error " + exception);
        }
    }
}

