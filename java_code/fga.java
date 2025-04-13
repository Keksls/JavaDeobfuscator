/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.NotNull
 */
import org.jetbrains.annotations.NotNull;

public class fga
extends ffy_0 {
    private final UL h;

    public fga(int n, int n2, int n3, long l, long l2, byte by, short s2, short s3, @NotNull UL uL) {
        super(n, n2, n3, l, l2, by, s2, s3);
        this.h = uL;
    }

    public UL j() {
        return this.h;
    }

    @Override
    public boolean k() {
        return true;
    }

    public String toString() {
        return "MountDefinition{m_mountType=" + this.h + ", m_id=" + this.a + ", m_gfxId='" + this.b + "', m_health=" + this.c + ", m_xpPerLevel=" + this.d + ", m_maxLevel=" + this.e + ", m_healItemRefIds=" + this.f + ", m_petDefinitionMeal=" + this.g + "}";
    }
}

