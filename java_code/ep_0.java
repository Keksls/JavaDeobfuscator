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
 * Renamed from ep
 */
public final class ep_0
extends GeneratedMessageV3
implements et_0 {
    private static final long c = 0L;
    public static final int a = 2;
    MapField<Integer, el_0> d;
    private byte e = (byte)-1;
    private static final ep_0 f = new ep_0();
    @Deprecated
    public static final Parser<ep_0> b = new eq_0();

    ep_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ep_0() {
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ep_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block10: while (!bl2) {
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block10;
                    }
                    default: {
                        if (this.parseUnknownField(codedInputStream, builder, extensionRegistryLite, n)) continue block10;
                        bl2 = true;
                        continue block10;
                    }
                    case 18: 
                }
                if (!(bl & true)) {
                    this.d = MapField.newMapField(es_0.a);
                    bl |= true;
                }
                MapEntry mapEntry = (MapEntry)codedInputStream.readMessage(es_0.a.getParserForType(), extensionRegistryLite);
                this.d.getMutableMap().put((Integer)mapEntry.getKey(), (el_0)mapEntry.getValue());
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
        return ef.a;
    }

    protected MapField internalGetMapField(int n) {
        switch (n) {
            case 2: {
                return this.l();
            }
        }
        throw new RuntimeException("Invalid map field number: " + n);
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ef.b.ensureFieldAccessorsInitialized(ep_0.class, er_0.class);
    }

    MapField<Integer, el_0> l() {
        if (this.d == null) {
            return MapField.emptyMapField(es_0.a);
        }
        return this.d;
    }

    @Override
    public int b() {
        return this.l().getMap().size();
    }

    @Override
    public boolean a(int n) {
        return this.l().getMap().containsKey(n);
    }

    @Override
    @Deprecated
    public Map<Integer, el_0> c() {
        return this.d();
    }

    @Override
    public Map<Integer, el_0> d() {
        return this.l().getMap();
    }

    @Override
    public el_0 a(int n, el_0 el_02) {
        Map map = this.l().getMap();
        return map.containsKey(n) ? (el_0)map.get(n) : el_02;
    }

    @Override
    public el_0 b(int n) {
        Map map = this.l().getMap();
        if (!map.containsKey(n)) {
            throw new IllegalArgumentException();
        }
        return (el_0)map.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.e;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        for (el_0 el_02 : this.d().values()) {
            if (el_02.isInitialized()) continue;
            this.e = 0;
            return false;
        }
        this.e = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        GeneratedMessageV3.serializeIntegerMapTo((CodedOutputStream)codedOutputStream, this.l(), es_0.a, (int)2);
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (Map.Entry entry : this.l().getMap().entrySet()) {
            MapEntry mapEntry = es_0.a.newBuilderForType().setKey((Object)((Integer)entry.getKey())).setValue((Object)((el_0)entry.getValue())).build();
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)mapEntry);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ep_0)) {
            return super.equals(object);
        }
        ep_0 ep_02 = (ep_0)object;
        boolean bl = true;
        bl = bl && this.l().equals(ep_02.l());
        bl = bl && this.unknownFields.equals((Object)ep_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ep_0.a().hashCode();
        if (!this.l().getMap().isEmpty()) {
            n = 37 * n + 2;
            n = 53 * n + this.l().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ep_0 a(ByteBuffer byteBuffer) {
        return (ep_0)b.parseFrom(byteBuffer);
    }

    public static ep_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ep_0)b.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ep_0 a(ByteString byteString) {
        return (ep_0)b.parseFrom(byteString);
    }

    public static ep_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ep_0)b.parseFrom(byteString, extensionRegistryLite);
    }

    public static ep_0 a(byte[] byArray) {
        return (ep_0)b.parseFrom(byArray);
    }

    public static ep_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ep_0)b.parseFrom(byArray, extensionRegistryLite);
    }

    public static ep_0 a(InputStream inputStream) {
        return (ep_0)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream);
    }

    public static ep_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ep_0)GeneratedMessageV3.parseWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ep_0 b(InputStream inputStream) {
        return (ep_0)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream);
    }

    public static ep_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ep_0)GeneratedMessageV3.parseDelimitedWithIOException(b, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ep_0 a(CodedInputStream codedInputStream) {
        return (ep_0)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream);
    }

    public static ep_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ep_0)GeneratedMessageV3.parseWithIOException(b, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public er_0 e() {
        return ep_0.f();
    }

    public static er_0 f() {
        return f.g();
    }

    public static er_0 a(ep_0 ep_02) {
        return f.g().a(ep_02);
    }

    public er_0 g() {
        return this == f ? new er_0() : new er_0().a(this);
    }

    protected er_0 a(GeneratedMessageV3.BuilderParent builderParent) {
        er_0 er_02 = new er_0(builderParent);
        return er_02;
    }

    public static ep_0 h() {
        return f;
    }

    public static Parser<ep_0> i() {
        return b;
    }

    public Parser<ep_0> getParserForType() {
        return b;
    }

    public ep_0 j() {
        return f;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.j();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.j();
    }

    static /* synthetic */ boolean k() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ep_0 ep_02) {
        return ep_02.unknownFields;
    }
}

