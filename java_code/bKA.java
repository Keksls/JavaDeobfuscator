/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  org.jetbrains.annotations.Nullable
 */
import org.jetbrains.annotations.Nullable;

public final class bKA {
    private bKA() {
    }

    @Nullable
    public static String a(faI faI2) {
        Object object;
        switch (faI2) {
            case b: {
                object = "HPShort";
                break;
            }
            case c: {
                object = "APShort";
                break;
            }
            case d: {
                object = "MPShort";
                break;
            }
            case e: {
                object = "WPShort";
                break;
            }
            case f: 
            case g: 
            case i: 
            case k: 
            case m: 
            case t: 
            case u: 
            case w: 
            case y: 
            case A: {
                object = "market.characteristics." + faI2.name();
                break;
            }
            case o: 
            case p: 
            case q: 
            case r: 
            case s: 
            case C: 
            case D: 
            case E: 
            case F: 
            case G: 
            case H: 
            case I: 
            case J: 
            case K: 
            case L: 
            case M: 
            case N: 
            case O: {
                object = faI2.b().name();
                break;
            }
            default: {
                return null;
            }
        }
        return bae.h().a((String)object, new Object[0]);
    }

    @Nullable
    public static String b(faI faI2) {
        switch (faI2) {
            case f: {
                return "iconSword";
            }
            case g: {
                return "smallFireElement";
            }
            case i: {
                return "smallEarthElement";
            }
            case k: {
                return "smallWaterElement";
            }
            case m: {
                return "smallAirElement";
            }
            case t: {
                return "iconShield";
            }
            case u: {
                return "smallFireResistance";
            }
            case w: {
                return "smallEarthResistance";
            }
            case y: {
                return "smallWaterResistance";
            }
            case A: {
                return "smallAirResistance";
            }
            case b: 
            case c: 
            case d: 
            case e: 
            case o: 
            case p: 
            case q: 
            case r: 
            case s: 
            case C: 
            case D: 
            case E: 
            case F: 
            case G: 
            case H: 
            case I: 
            case J: 
            case K: 
            case L: 
            case M: 
            case N: 
            case O: {
                return "icon" + faI2.b().name();
            }
        }
        return null;
    }
}

