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
 * Renamed from ib
 */
public final class ib_0
extends GeneratedMessageV3
implements if {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    MapField<Integer, ig> f;
    public static final int b = 2;
    long g;
    private byte h = (byte)-1;
    private static final ib_0 i = new ib_0();
    @Deprecated
    public static final Parser<ib_0> c = new ic_0();

    ib_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ib_0() {
        this.g = 0L;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ib_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block11: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block11;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block11;
                        bl2 = true;
                        continue block11;
                    }
                    case 10: {
                        if (!(bl & true)) {
                            this.f = MapField.newMapField(ie.a);
                            bl |= true;
                        }
                        MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(ie.a.getParserForType(), extensionRegistryLite);
                        this.f.getMutableMap().put((Integer)mapEntry.getKey(), (ig)mapEntry.getValue());
                        continue block11;
                    }
                    case 16: 
                }
                this.e |= 1;
                this.g = codedInputStream.readInt64();
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
        return hR.e;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 1: {
                return this.n();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return hR.f.ensureFieldAccessorsInitialized(ib_0.class, id.class);
    }

    MapField<Integer, ig> n() {
        if (this.f == null) {
            return MapField.emptyMapField(ie.a);
        }
        return this.f;
    }

    @Override
    public int b() {
        return this.n().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.n().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, ig> c() {
        return this.d();
    }

    @Override
    public Map<Integer, ig> d() {
        return this.n().getMap();
    }

    @Override
    public ig a(int n, ig ig2) {
        Map map = this.n().getMap();
        return map.containsKey(n) ? (ig)map.get(n) : ig2;
    }

    @Override
    public ig b(int n) {
        Map map = this.n().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (ig)map.get(n);
    }

    @Override
    public boolean e() {
        return (this.e & 1) == 1;
    }

    @Override
    public long f() {
        return this.g;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (ig ig2 : this.d().values()) {
            if (ig2.isInitialized()) continue;
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.n(), ie.a, (int)1);
        if ((this.e & 1) == 1) {
            codedOutputStream.writeInt64(2, this.g);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.n().getMap().entrySet()) {
            MapEntry mapEntry = ie.a.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((ig)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)mapEntry);
        }
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeInt64Size((int)2, (long)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ib_0)) {
            return super.equals(object);
        }
        ib_0 ib_02 = (ib_0)object;
        boolean bl = true;
        bl = bl && this.n().equals(ib_02.n());
        boolean bl2 = bl = bl && this.e() == ib_02.e();
        if (this.e()) {
            bl = bl && this.f() == ib_02.f();
        }
        bl = bl && this.unknownFields.equals((Object)ib_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ib_0.a().hashCode();
        if (!this.n().getMap().isEmpty()) {
            n = 37 * n + 1;
            n = 53 * n + this.n().hashCode();
        }
        if (this.e()) {
            n = 37 * n + 2;
            n = 53 * n + Internal.hashLong((long)this.f());
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ib_0 a(ByteBuffer byteBuffer) {
        return (ib_0)c.parseFrom(byteBuffer);
    }

    public static ib_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ib_0)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ib_0 a(ByteString byteString) {
        return (ib_0)c.parseFrom(byteString);
    }

    public static ib_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ib_0)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static ib_0 a(byte[] byArray) {
        return (ib_0)c.parseFrom(byArray);
    }

    public static ib_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ib_0)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static ib_0 a(InputStream inputStream) {
        return (ib_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static ib_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ib_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ib_0 b(InputStream inputStream) {
        return (ib_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static ib_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ib_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ib_0 a(CodedInputStream codedInputStream) {
        return (ib_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static ib_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ib_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public id g() {
        return ib_0.h();
    }

    public static id h() {
        return i.i();
    }

    public static id a(ib_0 ib_02) {
        return i.i().a(ib_02);
    }

    public id i() {
        return this == i ? new id() : new id().a(this);
    }

    protected id a(GeneratedMessageV3.BuilderParent builderParent) {
        id id2 = new id(builderParent);
        return id2;
    }

    public static ib_0 j() {
        return i;
    }

    public static Parser<ib_0> k() {
        return c;
    }

    public Parser<ib_0> getParserForType() {
        return c;
    }

    public ib_0 l() {
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

    static /* synthetic */ UnknownFieldSet b(ib_0 ib_02) {
        return ib_02.unknownFields;
    }
}

