/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  gnu.trove.procedure.TShortProcedure
 */
import gnu.trove.procedure.TShortProcedure;

class emR
implements TShortProcedure {
    private final short a;

    emR(short s2) {
        this.a = s2;
    }

    public boolean execute(short s2) {
        return this.a != s2;
    }

    public String toString() {
        return "RightFromCommandFinder{m_command=" + this.a + "} " + super.toString();
    }
}

