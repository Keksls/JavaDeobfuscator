/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.protobuf.AbstractMessage
 *  com.google.protobuf.AbstractMessage$Builder
 *  com.google.protobuf.AbstractMessage$BuilderParent
 *  com.google.protobuf.AbstractMessageLite$Builder
 *  com.google.protobuf.CodedInputStream
 *  com.google.protobuf.Descriptors$Descriptor
 *  com.google.protobuf.Descriptors$FieldDescriptor
 *  com.google.protobuf.Descriptors$OneofDescriptor
 *  com.google.protobuf.ExtensionRegistryLite
 *  com.google.protobuf.GeneratedMessageV3$Builder
 *  com.google.protobuf.GeneratedMessageV3$BuilderParent
 *  com.google.protobuf.GeneratedMessageV3$FieldAccessorTable
 *  com.google.protobuf.InvalidProtocolBufferException
 *  com.google.protobuf.Message
 *  com.google.protobuf.Message$Builder
 *  com.google.protobuf.MessageLite
 *  com.google.protobuf.MessageLite$Builder
 *  com.google.protobuf.SingleFieldBuilderV3
 *  com.google.protobuf.UnknownFieldSet
 */
import com.google.protobuf.AbstractMessage;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.Descriptors;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageV3;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.Message;
import com.google.protobuf.MessageLite;
import com.google.protobuf.SingleFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;

public final class Bi
extends GeneratedMessageV3.Builder<Bi>
implements Bj {
    private int a;
    private long b;
    private BG c = null;
    private SingleFieldBuilderV3<BG, bi_0, bp_0> d;

    public static final Descriptors.Descriptor a() {
        return AO.g;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return AO.h.ensureFieldAccessorsInitialized(bg_0.class, Bi.class);
    }

    Bi() {
        this.o();
    }

    Bi(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.o();
    }

    private void o() {
        if (bg_0.m()) {
            this.p();
        }
    }

    public Bi g() {
        super.clear();
        this.b = 0L;
        this.a &= 0xFFFFFFFE;
        if (this.d == null) {
            this.c = null;
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return AO.g;
    }

    public bg_0 h() {
        return bg_0.j();
    }

    public bg_0 i() {
        bg_0 bg_02 = this.j();
        if (!bg_02.isInitialized()) {
            throw Bi.newUninitializedMessageException((Message)bg_02);
        }
        return bg_02;
    }

    public bg_0 j() {
        bg_0 bg_02 = new bg_0(this);
        int n = this.a;
        int n2 = 0;
        if ((n & 1) == 1) {
            n2 |= 1;
        }
        bg_02.f = this.b;
        if ((n & 2) == 2) {
            n2 |= 2;
        }
        bg_02.g = this.d == null ? this.c : (BG)this.d.build();
        bg_02.e = n2;
        this.onBuilt();
        return bg_02;
    }

    public Bi k() {
        return (Bi)super.clone();
    }

    public Bi a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Bi)super.setField(fieldDescriptor, object);
    }

    public Bi a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (Bi)super.clearField(fieldDescriptor);
    }

    public Bi a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (Bi)super.clearOneof(oneofDescriptor);
    }

    public Bi a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (Bi)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public Bi b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (Bi)super.addRepeatedField(fieldDescriptor, object);
    }

    public Bi a(Message message) {
        if (message instanceof bg_0) {
            return this.a((bg_0)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public Bi a(bg_0 bg_02) {
        if (bg_02 == bg_0.j()) {
            return this;
        }
        if (bg_02.b()) {
            this.a(bg_02.c());
        }
        if (bg_02.d()) {
            this.b(bg_02.e());
        }
        this.b(bg_0.b(bg_02));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        if (!this.b()) {
            return false;
        }
        if (!this.d()) {
            return false;
        }
        return this.e().isInitialized();
    }

    public Bi a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bg_0 bg_02 = null;
        try {
            bg_02 = (bg_0)bg_0.c.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bg_02 = (bg_0)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bg_02 != null) {
                this.a(bg_02);
            }
        }
        return this;
    }

    @Override
    public boolean b() {
        return (this.a & 1) == 1;
    }

    @Override
    public long c() {
        return this.b;
    }

    public Bi a(long l) {
        this.a |= 1;
        this.b = l;
        this.onChanged();
        return this;
    }

    public Bi l() {
        this.a &= 0xFFFFFFFE;
        this.b = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean d() {
        return (this.a & 2) == 2;
    }

    @Override
    public BG e() {
        if (this.d == null) {
            return this.c == null ? BG.h() : this.c;
        }
        return (BG)this.d.getMessage();
    }

    public Bi a(BG bG) {
        if (this.d == null) {
            if (bG == null) {
                throw new NullPointerException();
            }
            this.c = bG;
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)bG);
        }
        this.a |= 2;
        return this;
    }

    public Bi a(bi_0 bi_02) {
        if (this.d == null) {
            this.c = bi_02.g();
            this.onChanged();
        } else {
            this.d.setMessage((AbstractMessage)bi_02.g());
        }
        this.a |= 2;
        return this;
    }

    public Bi b(BG bG) {
        if (this.d == null) {
            this.c = (this.a & 2) == 2 && this.c != null && this.c != BG.h() ? BG.a(this.c).a(bG).h() : bG;
            this.onChanged();
        } else {
            this.d.mergeFrom((AbstractMessage)bG);
        }
        this.a |= 2;
        return this;
    }

    public Bi m() {
        if (this.d == null) {
            this.c = null;
            this.onChanged();
        } else {
            this.d.clear();
        }
        this.a &= 0xFFFFFFFD;
        return this;
    }

    public bi_0 n() {
        this.a |= 2;
        this.onChanged();
        return (bi_0)this.p().getBuilder();
    }

    @Override
    public bp_0 f() {
        if (this.d != null) {
            return (bp_0)this.d.getMessageOrBuilder();
        }
        return this.c == null ? BG.h() : this.c;
    }

    private SingleFieldBuilderV3<BG, bi_0, bp_0> p() {
        if (this.d == null) {
            this.d = new SingleFieldBuilderV3((AbstractMessage)this.e(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.c = null;
        }
        return this.d;
    }

    public final Bi a(UnknownFieldSet unknownFieldSet) {
        return (Bi)super.setUnknownFields(unknownFieldSet);
    }

    public final Bi b(UnknownFieldSet unknownFieldSet) {
        return (Bi)super.mergeUnknownFields(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ GeneratedMessageV3.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ GeneratedMessageV3.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ GeneratedMessageV3.Builder clear() {
        return this.g();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.k();
    }

    public /* synthetic */ AbstractMessage.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessage.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ AbstractMessage.Builder clear() {
        return this.g();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.k();
    }

    public /* synthetic */ Message.Builder mergeUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.b(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder setUnknownFields(UnknownFieldSet unknownFieldSet) {
        return this.a(unknownFieldSet);
    }

    public /* synthetic */ Message.Builder addRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.b(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder setRepeatedField(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return this.a(fieldDescriptor, n, object);
    }

    public /* synthetic */ Message.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ Message.Builder clearField(Descriptors.FieldDescriptor fieldDescriptor) {
        return this.a(fieldDescriptor);
    }

    public /* synthetic */ Message.Builder setField(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return this.a(fieldDescriptor, object);
    }

    public /* synthetic */ Message.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ Message.Builder clone() {
        return this.k();
    }

    public /* synthetic */ Message buildPartial() {
        return this.j();
    }

    public /* synthetic */ Message build() {
        return this.i();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.j();
    }

    public /* synthetic */ MessageLite build() {
        return this.i();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.g();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.h();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.k();
    }

    public /* synthetic */ Object clone() {
        return this.k();
    }
}

