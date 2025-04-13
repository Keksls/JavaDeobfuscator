/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.EnumSet;
import java.util.Iterator;
import java.util.Map;

/*
 * Renamed from eCq
 */
public class ecq_0
extends eco_0 {
    public static final ecs_0 d = new ecs_0(-2, 0);
    public static final byte e = -2;
    private final eco_0 f;

    public ecq_0(eco_0 eco_02, int n, short s2) {
        super(-2, n, s2, eco_02.i(), eco_02.j(), eco_02.m(), null, eco_02.a(), EnumSet.noneOf(ecp_0.class), ecs_0.a, eco_02.o(), null);
        this.f = eco_02;
    }

    @Override
    public int e() {
        return this.f.e();
    }

    @Override
    public byte b() {
        return -2;
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

    @Override
    public Iterator<Map.Entry<Integer, Cm<Short, Short>>> l() {
        return this.f.l();
    }

    @Override
    public String toString() {
        return "FailingSecretCraftRecipe{m_secretRecipe=" + this.f + "}";
    }
}

