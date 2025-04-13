/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;

/*
 * Renamed from eCr
 */
public class ecr_0
extends eco_0 {
    public static final ecs_0 d = new ecs_0(-1, 0);
    public static final byte e = -1;

    public ecr_0(int n, short s2) {
        super(-1, n, s2, 10000L, 100, null, null, false, null, ecs_0.a, 0, null);
    }

    @Override
    public byte b() {
        return -1;
    }

    @Override
    public void a(ecp_0 ecp_02) {
        throw new UnsupportedOperationException("Impossible de rajouter une propri\u00e9t\u00e9 sur une SecretRecipe");
    }

    @Override
    public void a(Collection<ecp_0> collection) {
        throw new UnsupportedOperationException("Impossible de rajouter une propri\u00e9t\u00e9 sur une SecretRecipe");
    }

    @Override
    public void b(ecp_0 ecp_02) {
        throw new UnsupportedOperationException("Impossible de rajouter une propri\u00e9t\u00e9 sur une SecretRecipe");
    }

    @Override
    public void b(Collection<ecp_0> collection) {
        throw new UnsupportedOperationException("Impossible de rajouter une propri\u00e9t\u00e9 sur une SecretRecipe");
    }

    @Override
    public double a(short s2) {
        return 1.0;
    }

    @Override
    public long a(short s2, emh_0 emh_02) {
        return 0L;
    }

    @Override
    public ecs_0 k() {
        return d;
    }

    public void a(int n, short s2) {
        this.c.put(n, new Cm<Short, Short>(s2, (short)-1));
    }
}

