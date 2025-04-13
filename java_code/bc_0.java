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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from BC
 */
public final class bc_0
extends GeneratedMessageV3
implements bf_0 {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    int f;
    public static final int b = 2;
    AY g;
    private byte h = (byte)-1;
    private static final bc_0 i = new bc_0();
    @Deprecated
    public static final Parser<bc_0> c = new bd_0();

    bc_0(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private bc_0() {
        this.f = 0;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    bc_0(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                    case 8: {
                        this.e |= 1;
                        this.f = codedInputStream.readInt32();
                        continue block11;
                    }
                    case 18: 
                }
                ba_0 ba_02 = null;
                if ((this.e & 2) == 2) {
                    ba_02 = this.g.p();
                }
                this.g = (AY)codedInputStream.readMessage(AY.f, extensionRegistryLite);
                if (ba_02 != null) {
                    ba_02.a(this.g);
                    this.g = ba_02.q();
                }
                this.e |= 2;
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
        return AO.s;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.t.ensureFieldAccessorsInitialized(bc_0.class, BE.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public int c() {
        return this.f;
    }

    @Override
    public boolean d() {
        return (this.e & 2) == 2;
    }

    @Override
    public AY e() {
        return this.g == null ? AY.q() : this.g;
    }

    @Override
    public bb_0 f() {
        return this.g == null ? AY.q() : this.g;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        if (this.d() && !this.e().isInitialized()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeInt32(1, this.f);
        }
        if ((this.e & 2) == 2) {
            codedOutputStream.writeMessage(2, (MessageLite)this.e());
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if ((this.e & 1) == 1) {
            n += CodedOutputStream.computeInt32Size((int)1, (int)this.f);
        }
        if ((this.e & 2) == 2) {
            n += CodedOutputStream.computeMessageSize((int)2, (MessageLite)this.e());
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof bc_0)) {
            return super.equals(object);
        }
        bc_0 bc_02 = (bc_0)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == bc_02.b();
        if (this.b()) {
            bl = bl && this.c() == bc_02.c();
        }
        boolean bl3 = bl = bl && this.d() == bc_02.d();
        if (this.d()) {
            bl = bl && this.e().equals(bc_02.e());
        }
        bl = bl && this.unknownFields.equals((Object)bc_02.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + bc_0.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static bc_0 a(ByteBuffer byteBuffer) {
        return (bc_0)c.parseFrom(byteBuffer);
    }

    public static bc_0 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_0)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static bc_0 a(ByteString byteString) {
        return (bc_0)c.parseFrom(byteString);
    }

    public static bc_0 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_0)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static bc_0 a(byte[] byArray) {
        return (bc_0)c.parseFrom(byArray);
    }

    public static bc_0 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_0)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static bc_0 a(InputStream inputStream) {
        return (bc_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static bc_0 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_0)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bc_0 b(InputStream inputStream) {
        return (bc_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static bc_0 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_0)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static bc_0 a(CodedInputStream codedInputStream) {
        return (bc_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static bc_0 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (bc_0)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public BE g() {
        return bc_0.h();
    }

    public static BE h() {
        return i.i();
    }

    public static BE a(bc_0 bc_02) {
        return i.i().a(bc_02);
    }

    public BE i() {
        return this == i ? new BE() : new BE().a(this);
    }

    protected BE a(GeneratedMessageV3.BuilderParent builderParent) {
        BE bE = new BE(builderParent);
        return bE;
    }

    public static bc_0 j() {
        return i;
    }

    public static Parser<bc_0> k() {
        return c;
    }

    public Parser<bc_0> getParserForType() {
        return c;
    }

    public bc_0 l() {
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

    static /* synthetic */ UnknownFieldSet b(bc_0 bc_02) {
        return bc_02.unknownFields;
    }
}

