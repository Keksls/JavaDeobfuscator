/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from crz
 */
public class crz_0
extends ps_0 {
    private long a;
    private int b;

    @Override
    public boolean a(byte[] byArray) {
        ByteBuffer byteBuffer = ByteBuffer.wrap(byArray);
        this.a = byteBuffer.getLong();
        this.b = byteBuffer.getInt();
        return true;
    }

    @Override
    public int a() {
        return 12444;
    }

    public long b() {
        return this.a;
    }

    public int c() {
        return this.b;
    }

    @Override
    public String toString() {
        return "AchievementObjectiveResetMessage{m_characterId=" + this.a + ", m_objectiveId=" + this.b + "}";
    }
}

