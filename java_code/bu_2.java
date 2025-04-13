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
 *  com.google.protobuf.RepeatedFieldBuilderV3
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
import com.google.protobuf.RepeatedFieldBuilderV3;
import com.google.protobuf.UnknownFieldSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from bu
 */
public final class bu_2
extends GeneratedMessageV3.Builder<bu_2>
implements bv_1 {
    private int a;
    private List<bo_1> b = Collections.emptyList();
    private RepeatedFieldBuilderV3<bo_1, bq_1, br_1> c;

    public static final Descriptors.Descriptor a() {
        return ak_2.ag;
    }

    protected GeneratedMessageV3.FieldAccessorTable internalGetFieldAccessorTable() {
        return ak_2.ah.ensureFieldAccessorsInitialized(bs_1.class, bu_2.class);
    }

    bu_2() {
        this.m();
    }

    bu_2(GeneratedMessageV3.BuilderParent builderParent) {
        super(builderParent);
        this.m();
    }

    private void m() {
        if (bs_1.k()) {
            this.o();
        }
    }

    public bu_2 e() {
        super.clear();
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
        } else {
            this.c.clear();
        }
        return this;
    }

    public Descriptors.Descriptor getDescriptorForType() {
        return ak_2.ag;
    }

    public bs_1 f() {
        return bs_1.h();
    }

    public bs_1 g() {
        bs_1 bs_12 = this.h();
        if (!bs_12.isInitialized()) {
            throw bu_2.newUninitializedMessageException((Message)bs_12);
        }
        return bs_12;
    }

    public bs_1 h() {
        bs_1 bs_12 = new bs_1(this);
        int n = this.a;
        if (this.c == null) {
            if ((this.a & 1) == 1) {
                this.b = Collections.unmodifiableList(this.b);
                this.a &= 0xFFFFFFFE;
            }
            bs_12.c = this.b;
        } else {
            bs_12.c = this.c.build();
        }
        this.onBuilt();
        return bs_12;
    }

    public bu_2 i() {
        return (bu_2)super.clone();
    }

    public bu_2 a(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bu_2)super.setField(fieldDescriptor, object);
    }

    public bu_2 a(Descriptors.FieldDescriptor fieldDescriptor) {
        return (bu_2)super.clearField(fieldDescriptor);
    }

    public bu_2 a(Descriptors.OneofDescriptor oneofDescriptor) {
        return (bu_2)super.clearOneof(oneofDescriptor);
    }

    public bu_2 a(Descriptors.FieldDescriptor fieldDescriptor, int n, Object object) {
        return (bu_2)super.setRepeatedField(fieldDescriptor, n, object);
    }

    public bu_2 b(Descriptors.FieldDescriptor fieldDescriptor, Object object) {
        return (bu_2)super.addRepeatedField(fieldDescriptor, object);
    }

    public bu_2 a(Message message) {
        if (message instanceof bs_1) {
            return this.a((bs_1)message);
        }
        super.mergeFrom(message);
        return this;
    }

    public bu_2 a(bs_1 bs_12) {
        if (bs_12 == bs_1.h()) {
            return this;
        }
        if (this.c == null) {
            if (!bs_12.c.isEmpty()) {
                if (this.b.isEmpty()) {
                    this.b = bs_12.c;
                    this.a &= 0xFFFFFFFE;
                } else {
                    this.n();
                    this.b.addAll(bs_12.c);
                }
                this.onChanged();
            }
        } else if (!bs_12.c.isEmpty()) {
            if (this.c.isEmpty()) {
                this.c.dispose();
                this.c = null;
                this.b = bs_12.c;
                this.a &= 0xFFFFFFFE;
                this.c = bs_1.l() ? this.o() : null;
            } else {
                this.c.addAllMessages(bs_12.c);
            }
        }
        this.b(bs_1.b(bs_12));
        this.onChanged();
        return this;
    }

    public final boolean isInitialized() {
        return true;
    }

    public bu_2 a(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        bs_1 bs_12 = null;
        try {
            bs_12 = (bs_1)bs_1.f.parsePartialFrom(codedInputStream, extensionRegistryLite);
        }
        catch (InvalidProtocolBufferException invalidProtocolBufferException) {
            bs_12 = (bs_1)invalidProtocolBufferException.getUnfinishedMessage();
            throw invalidProtocolBufferException.unwrapIOException();
        }
        finally {
            if (bs_12 != null) {
                this.a(bs_12);
            }
        }
        return this;
    }

    private void n() {
        if ((this.a & 1) != 1) {
            this.b = new ArrayList<bo_1>(this.b);
            this.a |= 1;
        }
    }

    @Override
    public List<bo_1> b() {
        if (this.c == null) {
            return Collections.unmodifiableList(this.b);
        }
        return this.c.getMessageList();
    }

    @Override
    public int d() {
        if (this.c == null) {
            return this.b.size();
        }
        return this.c.getCount();
    }

    @Override
    public bo_1 a(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (bo_1)this.c.getMessage(n);
    }

    public bu_2 a(int n, bo_1 bo_12) {
        if (this.c == null) {
            if (bo_12 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.set(n, bo_12);
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)bo_12);
        }
        return this;
    }

    public bu_2 a(int n, bq_1 bq_12) {
        if (this.c == null) {
            this.n();
            this.b.set(n, bq_12.f());
            this.onChanged();
        } else {
            this.c.setMessage(n, (AbstractMessage)bq_12.f());
        }
        return this;
    }

    public bu_2 a(bo_1 bo_12) {
        if (this.c == null) {
            if (bo_12 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(bo_12);
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)bo_12);
        }
        return this;
    }

    public bu_2 b(int n, bo_1 bo_12) {
        if (this.c == null) {
            if (bo_12 == null) {
                throw new NullPointerException();
            }
            this.n();
            this.b.add(n, bo_12);
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)bo_12);
        }
        return this;
    }

    public bu_2 a(bq_1 bq_12) {
        if (this.c == null) {
            this.n();
            this.b.add(bq_12.f());
            this.onChanged();
        } else {
            this.c.addMessage((AbstractMessage)bq_12.f());
        }
        return this;
    }

    public bu_2 b(int n, bq_1 bq_12) {
        if (this.c == null) {
            this.n();
            this.b.add(n, bq_12.f());
            this.onChanged();
        } else {
            this.c.addMessage(n, (AbstractMessage)bq_12.f());
        }
        return this;
    }

    public bu_2 a(Iterable<? extends bo_1> iterable) {
        if (this.c == null) {
            this.n();
            AbstractMessageLite.Builder.addAll(iterable, this.b);
            this.onChanged();
        } else {
            this.c.addAllMessages(iterable);
        }
        return this;
    }

    public bu_2 j() {
        if (this.c == null) {
            this.b = Collections.emptyList();
            this.a &= 0xFFFFFFFE;
            this.onChanged();
        } else {
            this.c.clear();
        }
        return this;
    }

    public bu_2 c(int n) {
        if (this.c == null) {
            this.n();
            this.b.remove(n);
            this.onChanged();
        } else {
            this.c.remove(n);
        }
        return this;
    }

    public bq_1 d(int n) {
        return (bq_1)this.o().getBuilder(n);
    }

    @Override
    public br_1 b(int n) {
        if (this.c == null) {
            return this.b.get(n);
        }
        return (br_1)this.c.getMessageOrBuilder(n);
    }

    @Override
    public List<? extends br_1> c() {
        if (this.c != null) {
            return this.c.getMessageOrBuilderList();
        }
        return Collections.unmodifiableList(this.b);
    }

    public bq_1 k() {
        return (bq_1)this.o().addBuilder((AbstractMessage)bo_1.g());
    }

    public bq_1 e(int n) {
        return (bq_1)this.o().addBuilder(n, (AbstractMessage)bo_1.g());
    }

    public List<bq_1> l() {
        return this.o().getBuilderList();
    }

    private RepeatedFieldBuilderV3<bo_1, bq_1, br_1> o() {
        if (this.c == null) {
            this.c = new RepeatedFieldBuilderV3(this.b, (this.a & 1) == 1, (AbstractMessage.BuilderParent)this.getParentForChildren(), this.isClean());
            this.b = null;
        }
        return this.c;
    }

    public final bu_2 a(UnknownFieldSet unknownFieldSet) {
        return (bu_2)super.setUnknownFieldsProto3(unknownFieldSet);
    }

    public final bu_2 b(UnknownFieldSet unknownFieldSet) {
        return (bu_2)super.mergeUnknownFields(unknownFieldSet);
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
        return this.e();
    }

    public /* synthetic */ GeneratedMessageV3.Builder clone() {
        return this.i();
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
        return this.e();
    }

    public /* synthetic */ AbstractMessage.Builder clearOneof(Descriptors.OneofDescriptor oneofDescriptor) {
        return this.a(oneofDescriptor);
    }

    public /* synthetic */ AbstractMessage.Builder clone() {
        return this.i();
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
        return this.i();
    }

    public /* synthetic */ Message buildPartial() {
        return this.h();
    }

    public /* synthetic */ Message build() {
        return this.g();
    }

    public /* synthetic */ Message.Builder mergeFrom(Message message) {
        return this.a(message);
    }

    public /* synthetic */ Message.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ MessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ MessageLite buildPartial() {
        return this.h();
    }

    public /* synthetic */ MessageLite build() {
        return this.g();
    }

    public /* synthetic */ MessageLite.Builder clear() {
        return this.e();
    }

    public /* synthetic */ MessageLite getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ Message getDefaultInstanceForType() {
        return this.f();
    }

    public /* synthetic */ AbstractMessageLite.Builder mergeFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return this.a(codedInputStream, extensionRegistryLite);
    }

    public /* synthetic */ AbstractMessageLite.Builder clone() {
        return this.i();
    }

    public /* synthetic */ Object clone() {
        return this.i();
    }
}

