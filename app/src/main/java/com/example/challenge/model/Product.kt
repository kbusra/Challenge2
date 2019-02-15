package com.example.challenge.model


data class Product(

    val cargoTime: Int,
    val category: CategoryX,
    val categoryId: Int,
    val code: Any,
    val commentCount: Int,
    val commissionRate: Int,
    val definition: String,
    val difference: String,
    val id: Int,
    val images: List<Image>,
    val isActive: Boolean,
    val isApproved: Boolean,
    val isCargoFree: Boolean,
    val isEditorChoice: Boolean,
    val isLiked: Boolean,
    val isNew: Boolean,
    val isOwner: Boolean,
    val likeCount: Int,
    val maxInstallment: Any,
    val oldPrice: String = " ",
    val price: String = " ",
    val rejectReason: Any,
    val shareUrl: String,
    val shop: Shop,
    val slug: String = "",
    val stock: Int,
    val title: String = ""
)