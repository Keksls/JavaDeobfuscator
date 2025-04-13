/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * Renamed from cmA
 */
public class cma_0
extends Pw {
    private long a;
    private long b;
    private Map<Byte, List<ezb_0>> c = new HashMap<Byte, List<ezb_0>>();

    public cma_0 a(long l) {
        this.a = l;
        return this;
    }

    public cma_0 b(long l) {
        this.b = l;
        return this;
    }

    public cma_0 a(Map<Byte, List<ezb_0>> map) {
        this.c = map;
        return this;
    }

    @Override
    public byte[] b() {
        abx_2 abx_22 = new abx_2();
        abx_22.a(this.a);
        abx_22.a(this.b);
        abx_22.a(this.c.size());
        this.c.forEach((by, list) -> {
            abx_22.a((byte)by);
            abx_22.a(list.size());
            for (ezb_0 ezb_02 : list) {
                abx_22.a(ezb_02.c());
                abx_22.a((byte)ezb_02.a().ordinal());
            }
        });
        return this.a((byte)3, abx_22.c());
    }

    @Override
    public int a() {
        return 12165;
    }
}

