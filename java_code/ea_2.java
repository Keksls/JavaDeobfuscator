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
 * Renamed from eA
 */
public final class ea_2
extends GeneratedMessageV3
implements ed_2 {
    private static final long d = 0L;
    int e;
    public static final int a = 1;
    ByteString f;
    public static final int b = 2;
    ByteString g;
    private byte h = (byte)-1;
    private static final ea_2 i = new ea_2();
    @Deprecated
    public static final Parser<ea_2> c = new eb_2();

    ea_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ea_2() {
        this.f = ByteString.EMPTY;
        this.g = ByteString.EMPTY;
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ea_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        this.e |= 1;
                        this.f = codedInputStream.readBytes();
                        continue block11;
                    }
                    case 18: 
                }
                this.e |= 2;
                this.g = codedInputStream.readBytes();
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
        return eu_2.a;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return eu_2.b.ensureFieldAccessorsInitialized(ea_2.class, ec_2.class);
    }

    @Override
    public boolean b() {
        return (this.e & 1) == 1;
    }

    @Override
    public ByteString c() {
        return this.f;
    }

    @Override
    public boolean d() {
        return (this.e & 2) == 2;
    }

    @Override
    public ByteString e() {
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
        if (!this.b()) {
            this.h = 0;
            return false;
        }
        if (!this.d()) {
            this.h = 0;
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if ((this.e & 1) == 1) {
            codedOutputStream.writeBytes(1, this.f);
        }
        if ((this.e & 2) == 2) {
            codedOutputStream.writeBytes(2, this.g);
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
            n += CodedOutputStream.computeBytesSize((int)1, (ByteString)this.f);
        }
        if ((this.e & 2) == 2) {
            n += CodedOutputStream.computeBytesSize((int)2, (ByteString)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ea_2)) {
            return super.equals(object);
        }
        ea_2 ea_22 = (ea_2)object;
        boolean bl = true;
        boolean bl2 = bl = bl && this.b() == ea_22.b();
        if (this.b()) {
            bl = bl && this.c().equals((Object)ea_22.c());
        }
        boolean bl3 = bl = bl && this.d() == ea_22.d();
        if (this.d()) {
            bl = bl && this.e().equals((Object)ea_22.e());
        }
        bl = bl && this.unknownFields.equals((Object)ea_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ea_2.a().hashCode();
        if (this.b()) {
            n = 37 * n + 1;
            n = 53 * n + this.c().hashCode();
        }
        if (this.d()) {
            n = 37 * n + 2;
            n = 53 * n + this.e().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ea_2 a(ByteBuffer byteBuffer) {
        return (ea_2)c.parseFrom(byteBuffer);
    }

    public static ea_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ea_2)c.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ea_2 a(ByteString byteString) {
        return (ea_2)c.parseFrom(byteString);
    }

    public static ea_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ea_2)c.parseFrom(byteString, extensionRegistryLite);
    }

    public static ea_2 a(byte[] byArray) {
        return (ea_2)c.parseFrom(byArray);
    }

    public static ea_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ea_2)c.parseFrom(byArray, extensionRegistryLite);
    }

    public static ea_2 a(InputStream inputStream) {
        return (ea_2)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream);
    }

    public static ea_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ea_2)GeneratedMessageV3.parseWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ea_2 b(InputStream inputStream) {
        return (ea_2)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream);
    }

    public static ea_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ea_2)GeneratedMessageV3.parseDelimitedWithIOException(c, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ea_2 a(CodedInputStream codedInputStream) {
        return (ea_2)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream);
    }

    public static ea_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ea_2)GeneratedMessageV3.parseWithIOException(c, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public ec_2 f() {
        return ea_2.g();
    }

    public static ec_2 g() {
        return i.h();
    }

    public static ec_2 a(ea_2 ea_22) {
        return i.h().a(ea_22);
    }

    public ec_2 h() {
        return this == i ? new ec_2() : new ec_2().a(this);
    }

    protected ec_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        ec_2 ec_22 = new ec_2(builderParent);
        return ec_22;
    }

    public static ea_2 i() {
        return i;
    }

    public static Parser<ea_2> j() {
        return c;
    }

    public Parser<ea_2> getParserForType() {
        return c;
    }

    public ea_2 k() {
        return i;
    }

    protected /* synthetic */ Message.Builder newBuilderForType(GeneratedMessageV3.BuilderParent builderParent) {
        return this.a(builderParent);
    }

    public /* synthetic */ Message.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ Message.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder toBuilder() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder newBuilderForType() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.k();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.k();
    }

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ea_2 ea_22) {
        return ea_22.unknownFields;
    }
}

