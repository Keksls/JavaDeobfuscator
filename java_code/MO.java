/*
 * Decompiled with CFR 0.152.
 */
import java.beans.PropertyEditor;
import java.beans.PropertyEditorManager;
import java.lang.reflect.Field;

public final class MO {
    private MO() {
    }

    public static void a(MR mR, Object object) {
        Field[] fieldArray;
        for (Field field : fieldArray = object.getClass().getDeclaredFields()) {
            String string;
            if (!field.isAnnotationPresent(MQ.class) || !mR.b(string = field.getAnnotation(MQ.class).a())) continue;
            field.setAccessible(true);
            try {
                Object object2 = mR.a(string);
                if (object2 == null) continue;
                field.set(object, MO.a(field.getType(), object2));
            }
            catch (IllegalArgumentException illegalArgumentException) {
                throw new MP("Bad field type " + string, illegalArgumentException);
            }
            catch (IllegalAccessException illegalAccessException) {
                throw new MP("Cannot access field " + string, illegalAccessException);
            }
            catch (Exception exception) {
                throw new MP("Unable to set property " + string, exception);
            }
        }
    }

    private static Object a(Class<?> clazz, Object object) {
        PropertyEditor propertyEditor;
        PropertyEditor propertyEditor2 = propertyEditor = clazz.isEnum() ? new MN(clazz) : PropertyEditorManager.findEditor(clazz);
        if (propertyEditor == null) {
            return object;
        }
        Class<?> clazz2 = object.getClass();
        if (clazz2.equals(String.class)) {
            propertyEditor.setAsText((String)object);
        } else {
            propertyEditor.setValue(object);
        }
        return propertyEditor.getValue();
    }
}

