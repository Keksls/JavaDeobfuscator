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

/*
 * Renamed from bT
 */
public final class bt_1
extends GeneratedMessageV3.Builder<bt_1>
implements bu_1 {
    private long a;
    private bg_2 b = null;
    private SingleFieldBuilderV3<bg_2, bi_2, bk_2> c;

    public static final Descriptors.Descriptor a() {
        return ak_2.c;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.d.ensureFieldAccessorsInitialized(br_2.class, bt_1.class);
    }

    bt_1() {
        this.n();
    }

    bt_1(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.n();
    }

    private void n() {
        if (br_2.l()) {
            // empty if block
        }
    }

    public bt_1 f() {
        super.clear();
        this.a = 0L;
        if (this.c == null) {
            this.b = null;
        } else {
            this.b = null;
            this.c = null;
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.c;
    }

    public br_2 g() {
        return br_2.i();
    }

    public br_2 h() {
        br_2 br_22 = this.i();
        if (!br_22.isInitialized()) {
            throw bt_1.newUninitializedMessageException((Message)br_22);
        }
        return br_22;
    }

    public br_2 i() {
        br_2 br_22 = new br_2(this);
        br_22.d = this.a;
        br_22.e = this.c == null ? this.b : (bg_2)this.c.build();
        this.onBuilt();
        return br_22;
    }

    public bt_1 j() {
        return (bt_1)super.clone();
    }

    public bt_1 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bt_1)super.setField(fieldDescriptor, object);
    }

    public bt_1 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bt_1)super.clearField(fieldDescriptor);
    }

    public bt_1 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bt_1)super.clearOneof(oneofDescriptor);
    }

    public bt_1 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bt_1)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bt_1 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bt_1)super.addRepeatedField(fieldDescriptor, object);
    }

    public bt_1 a(Message message) {
        if (message instanceof br_2) {
            return this.a((br_2)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bt_1 a(br_2 br_22) {
        if (br_22 == br_2.i()) {
            return this;
        }
        if (br_22.b() != 0L) {
            this.a(br_22.b());
        }
        if (br_22.c()) {
            this.b(br_22.d());
        }
        this.b(br_2.b(br_22));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bt_1 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        br_2 br_22 = null;
        try {
            br_22 = (br_2)br_2.h.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            br_22 = (br_2)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (br_22 != null) {
                this.a(br_22);
            }
        }
        return this;
    }

    @Override
    public long b() {
        return this.a;
    }

    public bt_1 a(long l) {
        this.a = l;
        this.onChanged();
        return this;
    }

    public bt_1 k() {
        this.a = 0L;
        this.onChanged();
        return this;
    }

    @Override
    public boolean c() {
        return this.c != null || this.b != null;
    }

    @Override
    public bg_2 d() {
        if (this.c == null) {
            return this.b == null ? bg_2.k() : this.b;
        }
        return (bg_2)this.c.getMessage();
    }

    public bt_1 a(bg_2 bg_22) {
        if (this.c == null) {
            if (bg_22 == null) {
                throw new NullPointerException();
            }
            this.b = bg_22;
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)bg_22);
        }
        return this;
    }

    public bt_1 a(bi_2 bi_22) {
        if (this.c == null) {
            this.b = bi_22.i();
            this.onChanged();
        } else {
            this.c.setMessage((AbstractMessage)bi_22.i());
        }
        return this;
    }

    public bt_1 b(bg_2 bg_22) {
        if (this.c == null) {
            this.b = this.b != null ? bg_2.a(this.b).a(bg_22).j() : bg_22;
            this.onChanged();
        } else {
            this.c.mergeFrom((AbstractMessage)bg_22);
        }
        return this;
    }

    public bt_1 l() {
        if (this.c == null) {
            this.b = null;
            this.onChanged();
        } else {
            this.b = null;
            this.c = null;
        }
        return this;
    }

    public bi_2 m() {
        this.onChanged();
        return (bi_2)this.o().getBuilder();
    }

    @Override
    public bk_2 e() {
        if (this.c != null) {
            return (bk_2)this.c.getMessageOrBuilder();
        }
        return this.b == null ? bg_2.k() : this.b;
    }

    private SingleFieldBuilderV3<bg_2, bi_2, bk_2> o() {
        if (this.c == null) {
            this.c = new SingleFieldBuilderV3((AbstractMessage)this.d(), (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final bt_1 a(UnknownFieldSet unknownFieldSet) {
        return (bt_1)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final bt_1 b(UnknownFieldSet unknownFieldSet) {
        return (bt_1)super.mergeUnknownFields(unknownFieldSet);
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
        return this.f();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.j();
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
        return this.f();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.j();
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
        return this.j();
    }

    public /* synthetic */ Message buildPartial() {
        return this.i();
    }

    public /* synthetic */ Message build() {
        return this.h();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.i();
    }

    public /* synthetic */ MessageLite build() {
        return this.h();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.f();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.g();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.j();
    }

    public /* synthetic */ Object clone() {
        return this.j();
    }
}

