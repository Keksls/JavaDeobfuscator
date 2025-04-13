/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

/*
 * Renamed from aXq
 */
public class axq_0
extends aXj {
    private final int a;
    private final int b;
    private final List<Integer> c;

    public axq_0(int n) {
        this.a = n;
        this.b = -1;
        this.c = List.of();
    }

    public axq_0(int n, List<Integer> list) {
        this.a = 1;
        this.b = n;
        this.c = list;
    }

    @Override
    public boolean a() {
        return this.a != 1 || this.b >= 0;
    }

    @Override
    public void b() {
        if (this.a == 0) {
            axq_0.c();
        } else if (this.a == 1) {
            Pt pt = new Pt();
            pt.a((byte)3);
            pt.a((short)253);
            pt.b((byte)1);
            pt.a(this.b);
            pt.b((byte)this.c.size());
            for (int n : this.c) {
                pt.b((byte)n);
            }
            axq_0.a(pt);
        } else if (this.a == 2) {
            Pt pt = new Pt();
            pt.a((byte)3);
            pt.a((short)253);
            pt.b((byte)2);
            axq_0.a(pt);
        } else {
            aVo.a().d("A problem occurred with the mutePartition command");
        }
    }

    private static void a(Pt pt) {
        aaw_2 aaw_22 = azu_0.j().K();
        if (aaw_22 != null) {
            aaw_22.c(pt);
        } else {
            aVo.a().d("You need to be connected to access this command!");
        }
    }

    private static void c() {
        axq_0.a("\"help\" | \"h\" : show help");
        axq_0.a("[radius] : mute partitions for everything in the specified radius (default is 1)");
        axq_0.a("&lt;radius&gt; [type...] : mute partitions for the specified types in the specified radius (multiple types may be specified by separating them with spaces)");
        axq_0.a("\nTypes : ");
        for (fjy_0 fjy_02 : fjy_0.values()) {
            axq_0.a("   - " + fjy_02.name() + " : " + fjy_02.a());
        }
    }
}

