/*
 * Decompiled with CFR 0.152.
 */
import java.nio.ByteBuffer;

/*
 * Renamed from aDm
 */
public interface adm_2
extends adn_1 {
    public void a(ByteBuffer var1);

    @Override
    default public boolean a(byte[] byArray) {
        this.a(ByteBuffer.wrap(byArray));
        return true;
    }
}

