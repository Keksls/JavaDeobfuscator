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
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from ah
 */
public final class ah_2
extends GeneratedMessageV3
implements ak_1 {
    private static final long b = 0L;
    public static final int a = 1;
    List<W> c;
    private byte d = (byte)-1;
    private static final ah_2 e = new ah_2();
    static final Parser<ah_2> f = new ai_2();

    ah_2(GeneratedMessageV3.Builder<?> builder) {
        super(builder);
    }

    private ah_2() {
        this.c = Collections.emptyList();
    }

    public final UnknownFieldSet getUnknownFields() {
        return this.unknownFields;
    }

    ah_2(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
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
                        if (this.parseUnknownFieldProto3(codedInputStream, builder, extensionRegistryLite, n)) continue block10;
                        bl2 = true;
                        continue block10;
                    }
                    case 10: 
                }
                if (!(bl & true)) {
                    this.c = new ArrayList<W>();
                    bl |= true;
                }
                this.c.add((W)codedInputStream.readMessage(W.l(), extensionRegistryLite));
            }
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            throw invalidProtocolBufferException.setUnfinishedMessage((MessageLite)this);
        }
        catch (IOException iOException) {
            throw new InvalidProtocolBufferException(iOException).setUnfinishedMessage((MessageLite)this);
        }
        finally {
            if (bl & true) {
                this.c = Collections.unmodifiableList(this.c);
            }
            this.unknownFields = builder.build();
            this.makeExtensionsImmutable();
        }
    }

    public static final Descriptors.Descriptor a() {
        return e_0.m;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return e_0.n.ensureFieldAccessorsInitialized(ah_2.class, aj_1.class);
    }

    @Override
    public List<W> b() {
        return this.c;
    }

    @Override
    public List<? extends al_1> c() {
        return this.c;
    }

    @Override
    public int d() {
        return this.c.size();
    }

    @Override
    public W a(int n) {
        return this.c.get(n);
    }

    @Override
    public al_1 b(int n) {
        return this.c.get(n);
    }

    public final boolean isInitialized() {
        byte by = this.d;
        if (by == 1) {
            return true;
        }
        if (by == 0) {
            return false;
        }
        this.d = 1;
        return true;
    }

    public void writeTo(CodedOutputStream codedOutputStream) {
        for (int k = 0; k < this.c.size(); ++k) {
            codedOutputStream.writeMessage(1, (MessageLite)this.c.get(k));
        }
        this.unknownFields.writeTo(codedOutputStream);
    }

    public int getSerializedSize() {
        int n = this.memoizedSize;
        if (n != -1) {
            return n;
        }
        n = 0;
        for (int k = 0; k < this.c.size(); ++k) {
            n += CodedOutputStream.computeMessageSize((int)1, (MessageLite)((MessageLite)this.c.get(k)));
        }
        this.memoizedSize = n += this.unknownFields.getSerializedSize();
        return n;
    }

    public boolean equals(Object object) {
        if (object == this) {
            return true;
        }
        if (!(object instanceof ah_2)) {
            return super.equals(object);
        }
        ah_2 ah_22 = (ah_2)object;
        boolean bl = true;
        bl = bl && this.b().equals(ah_22.b());
        bl = bl && this.unknownFields.equals((Object)ah_22.unknownFields);
        return bl;
    }

    public int hashCode() {
        if (this.memoizedHashCode != 0) {
            return this.memoizedHashCode;
        }
        int n = 41;
        n = 19 * n + ah_2.a().hashCode();
        if (this.d() > 0) {
            n = 37 * n + 1;
            n = 53 * n + this.b().hashCode();
        }
        this.memoizedHashCode = n = 29 * n + this.unknownFields.hashCode();
        return n;
    }

    public static ah_2 a(ByteBuffer byteBuffer) {
        return (ah_2)f.parseFrom(byteBuffer);
    }

    public static ah_2 a(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (ah_2)f.parseFrom(byteBuffer, extensionRegistryLite);
    }

    public static ah_2 a(ByteString byteString) {
        return (ah_2)f.parseFrom(byteString);
    }

    public static ah_2 a(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (ah_2)f.parseFrom(byteString, extensionRegistryLite);
    }

    public static ah_2 a(byte[] byArray) {
        return (ah_2)f.parseFrom(byArray);
    }

    public static ah_2 a(byte[] byArray, ExtensionRegistryLite extensionRegistryLite) {
        return (ah_2)f.parseFrom(byArray, extensionRegistryLite);
    }

    public static ah_2 a(InputStream inputStream) {
        return (ah_2)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream);
    }

    public static ah_2 a(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ah_2)GeneratedMessageV3.parseWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ah_2 b(InputStream inputStream) {
        return (ah_2)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream);
    }

    public static ah_2 b(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ah_2)GeneratedMessageV3.parseDelimitedWithIOException(f, (InputStream)inputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public static ah_2 a(CodedInputStream codedInputStream) {
        return (ah_2)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream);
    }

    public static ah_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (ah_2)GeneratedMessageV3.parseWithIOException(f, (CodedInputStream)codedInputStream, (ExtensionRegistryLite)extensionRegistryLite);
    }

    public aj_1 e() {
        return ah_2.f();
    }

    public static aj_1 f() {
        return e.g();
    }

    public static aj_1 a(ah_2 ah_22) {
        return e.g().a(ah_22);
    }

    public aj_1 g() {
        return this == e ? new aj_1() : new aj_1().a(this);
    }

    protected aj_1 a(GeneratedMessageV3.BuilderParent builderParent) {
        aj_1 aj_12 = new aj_1(builderParent);
        return aj_12;
    }

    public static ah_2 h() {
        return e;
    }

    public static Parser<ah_2> i() {
        return f;
    }

    public Parser<ah_2> getParserForType() {
        return f;
    }

    public ah_2 j() {
        return e;
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

    static /* synthetic */ boolean l() {
        return alwaysUseFieldBuilders;
    }

    static /* synthetic */ UnknownFieldSet b(ah_2 ah_22) {
        return ah_22.unknownFields;
    }
}

