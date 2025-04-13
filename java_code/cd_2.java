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
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.Parser;
import com.google.protobuf.UnknownFieldSet;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/*
 * Renamed from cd
 */
public final class cd_2
extends GeneratedMessageV3
implements cq_1 {
    private static final long d = 0L;
    public static final int a = 1;
    long e;
    public static final int b = 2;
    volatile Object f;
    public static final int c = 3;
    volatile Object g;
    private byte h = (byte)-1;
    private static final cd_2 i = new cd_2();
    static final Parser<cd_2> j = new ce_1();

    cd_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private cd_2() {
        this.e = 0L;
        this.f = "";
        this.g = "";
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    cd_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        this();
        if (extensionRegistryLite == null) {
            throw new NullPointerException();
        }
        boolean bl = false;
        UnknownFieldSet.Builder builder = UnknownFieldSet.newBuilder();
        try {
            boolean bl2 = false;
            block12: while (!bl2) {
                String string;
                int n = codedInputStream.readTag();
                switch (n) {
                    case 0: {
                        bl2 = true;
                        continue block12;
                    }
                    default: {
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block12;
                        bl2 = true;
                        continue block12;
                    }
                    case 8: {
                        this.e = codedInputStream.readInt64();
                        continue block12;
                    }
                    case 18: {
                        string = codedInputStream.readStringRequireUtf8();
                        this.f = string;
                        continue block12;
                    }
                    case 26: 
                }
                string = codedInputStream.readStringRequireUtf8();
                this.g = string;
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
        return ak_2.S;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.T.ensureFieldAccessorsInitialized(cd_2.class, cf_2.class);
    }

    @Override
    public long b() {
        return this.e;
    }

    @Override
    public String c() {
        Object object = this.f;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.f = string;
        return string;
    }

    @Override
    public ByteString d() {
        Object object = this.f;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.f = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    @Override
    public String e() {
        Object object = this.g;
        if (object instanceof String) {
            return (String)object;
        }
        ByteString byteString = (ByteString)object;
        String string = byteString.toStringUtf8();
        this.g = string;
        return string;
    }

    @Override
    public ByteString f() {
        Object object = this.g;
        if (object instanceof String) {
            ByteString byteString = ByteString.copyFromUtf8((String)((String)object));
            this.g = byteString;
            return byteString;
        }
        return (ByteString)object;
    }

    public final boolean isInitialized() {
        byte by = this.h;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.h = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        if (this.e != 0L) {
            codedOutputStream.writeInt64(1, this.e);
        }
        if (!this.d().isEmpty()) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)2, (Object)this.f);
        }
        if (!this.f().isEmpty()) {
            GeneratedMessageV3.writeString((CodedOutputStream)codedOutputStream, (int)3, (Object)this.g);
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        if (this.e != 0L) {
            n += CodedOutputStream.computeInt64Size((int)1, (long)this.e);
        }
        if (!this.d().isEmpty()) {
            n += GeneratedMessageV3.computeStringSize((int)2, (Object)this.f);
        }
        if (!this.f().isEmpty()) {
            n += GeneratedMessageV3.computeStringSize((int)3, (Object)this.g);
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof cd_2)) {
            return super.equals(object);
        }
        cd_2 cd_22 = (cd_2)object;
        boolean bl = true;
        bl = bl && this.b() == cd_22.b();
        bl = bl && this.c().equals(cd_22.c());
        bl = bl && this.e().equals(cd_22.e());
        bl = bl && this.unknownFields.equals((Object)cd_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + cd_2.a().hashCode();
        n = 37 * n + 1;
        n = 53 * n + Internal.hashLong((long)this.b());
        n = 37 * n + 2;
        n = 53 * n + this.c().hashCode();
        n = 37 * n + 3;
        n = 53 * n + this.e().hashCode();
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static cd_2 a(ByteBuffer byteBuffer) {
        return (cd_2)j.parseFrom(byteBuffer);
    }

    public static cd_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (cd_2)j.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static cd_2 a(ByteString byteString) {
        return (cd_2)j.parseFrom(byteString);
    }

    public static cd_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (cd_2)j.parseFrom(byteString, extensionRegistryLite);
    }

    public static cd_2 a(byte[] byArray) {
        return (cd_2)j.parseFrom(byArray);
    }

    public static cd_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (cd_2)j.parseFrom(byArray, extensionRegistryLite);
    }

    public static cd_2 a(InputStream inputStream) {
        return (cd_2)GeneratedMessageV3.parseWithIOException(j, (InputStream)inputStream);
    }

    public static cd_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cd_2)GeneratedMessageV3.parseWithIOException(j, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cd_2 b(InputStream inputStream) {
        return (cd_2)GeneratedMessageV3.parseDelimitedWithIOException(j, (InputStream)inputStream);
    }

    public static cd_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cd_2)GeneratedMessageV3.parseDelimitedWithIOException(j, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static cd_2 a(CodedInputStream codedInputStream) {
        return (cd_2)GeneratedMessageV3.parseWithIOException(j, (CodedInputStream)codedInputStream);
    }

    public static cd_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (cd_2)GeneratedMessageV3.parseWithIOException(j, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public cf_2 g() {
        return cd_2.h();
    }

    public static cf_2 h() {
        return i.i();
    }

    public static cf_2 a(cd_2 cd_22) {
        return i.i().a(cd_22);
    }

    public cf_2 i() {
        return this == i ? new cf_2() : new cf_2().a(this);
    }

    protected cf_2 a(GeneratedMessageV3.BuilderParent builderParent) {
        cf_2 cf_22 = new cf_2(builderParent);
        return cf_22;
    }

    public static cd_2 j() {
        return i;
    }

    public static Parser<cd_2> k() {
        return j;
    }

    public Parser<cd_2> getParserForType() {
        return j;
    }

    public cd_2 l() {
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

    static /* synthetic */ UnknownFieldSet b(cd_2 cd_22) {
        return cd_22.unknownFields;
    }

    static /* synthetic */ void b(ByteString byteString) {
        cd_2.checkByteStringIsUtf8((ByteString)byteString);
    }

    static /* synthetic */ void c(ByteString byteString) {
        cd_2.checkByteStringIsUtf8((ByteString)byteString);
    }
}

