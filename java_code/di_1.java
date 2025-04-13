/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.ByteString
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.CodedOutputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.Internal
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.MapEntry
 *  com.google.protobuf.MapField
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.Parser
 *  com.google.protobuf.UnknownFieldSet
 *  com.google.protobuf.UnknownFieldSet$Builder
 */
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.CodedOutputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.Internal;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.MapEntry;
import com.google.protobuf.MapField;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Map;

/*
 * Renamed from dI
 */
public final class di_1
extends GeneratedMessageV3
implements dq_2 {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    boolean f;
    public static final int b = 2;
    MapField<Integer, dl_1> g;
    private byte h = (byte)-1;
    private static final di_1 i = new di_1();
    @Deprecated
    public static final Parser<di_1> c = new dj_1();

    di_1(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private di_1() {
        this.f = false;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    di_1(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        int n = 0;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl = false;
            block11: while (!bl) {
                int n2 = codedInputStream.readTag();
                switch (n2) {
                    case 0: {
                        bl = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n2)) continue block11;
                        bl = true;
                        continue block11;
                    }
                    case 8: {
                        this.e |= 1;
                        this.f = codedInputStream.readBool();
                        continue block11;
                    }
                    case 18: 
                }
                if ((n & 2) != 2) {
                    this.g = MapField.newMapField(do_2.a);
                    n |= 2;
                }
                MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(do_2.a.getParserForType(), extensionRegistryLite);
                this.g.getMutableMap().put((Integer)mapEntry.getKey(), (dl_1)mapEntry.getValue());
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return dn_1.k;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 2: {
                return this.n();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return dn_1.l.ensureFieldAccessorsInitialized(di_1.class, dk_1.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public boolean c() {
        return this.f;
    }

    MapField<Integer, dl_1> n() {
        if (this.g == null) {
            return MapField.emptyMapField(do_2.a);
        }
        return this.g;
    }

    @Override
    public int d() {
        return this.n().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.n().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, dl_1> e() {
        return this.f();
    }

    @Override
    public Map<Integer, dl_1> f() {
        return this.n().getMap();
    }

    @Override
    public dl_1 a(int n, dl_1 dl_12) {
        Map map = this.n().getMap();
        return map.containsKey(n) ? (dl_1)map.get(n) : dl_12;
    }

    @Override
    public dl_1 b(int n) {
        Map map = this.n().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (dl_1)map.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (!this.b()) {
            this.h = 0;
            return false;
        }
        for (dl_1 dl_12 : this.f().values()) {
            if (dl_12.isInitialized()) continue;
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeBool(1, this.f);
        }
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.n(), do_2.a, (int)2);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeBoolSize((int)1, (boolean)this.f);
        }
        for (Map.Entry entry : this.n().getMap().entrySet()) {
            MapEntry mapEntry = do_2.a.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((dl_1)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof di_1)) {
            return super.equals(object);
        }
        di_1 di_12 = (di_1)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == di_12.b();
        if (this.b()) {
            bl = bl && this.c() == di_12.c();
        }
        bl = bl && this.n().equals(di_12.n());
        bl = bl && this.unknownFields.equals((Object)di_12.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + di_1.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + Internal.hashBoolean((boolean)this.c());
        }
        if (!this.n().getMap().isEmpty()) {
            n = 37 * n + 2;
            n = 53 * n + this.n().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static di_1 a(ByteBuffer byteBuffer) {
        return (di_1)c.parseFrom(byteBuffer);
    }

    public static di_1 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (di_1)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static di_1 a(ByteString byteString) {
        return (di_1)c.parseFrom(byteString);
    }

    public static di_1 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (di_1)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static di_1 a(byte[] byArray) {
        return (di_1)c.parseFrom(byArray);
    }

    public static di_1 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (di_1)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static di_1 a(InputStream inputStream) {
        return (di_1)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static di_1 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (di_1)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static di_1 b(InputStream inputStream) {
        return (di_1)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static di_1 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (di_1)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static di_1 a(CodedInputStream codedInputStream) {
        return (di_1)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static di_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (di_1)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public dk_1 g() {
        return di_1.h();
    }

    public static dk_1 h() {
        return i.i();
    }

    public static dk_1 a(di_1 di_12) {
        return i.i().a(di_12);
    }

    public dk_1 i() {
        return this == i ? new dk_1() : new dk_1().a(this);
    }

    protected dk_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        dk_1 dk_12 = new dk_1(builderParent);
        return dk_12;
    }

    public static di_1 j() {
        return i;
    }

    public static Parser<di_1> k() {
        return c;
    }

    public Parser<di_1> getParserForType() {
        return c;
    }

    public di_1 l() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.l();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.l();
    }

    static /* synthetic */ boolean m() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(di_1 di_12) {
        return di_12.unknownFields;
    }
}

