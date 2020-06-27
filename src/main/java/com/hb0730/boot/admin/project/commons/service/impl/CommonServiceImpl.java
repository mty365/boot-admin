package com.hb0730.boot.admin.project.commons.service.impl;

import com.hb0730.boot.admin.commons.constant.enums.AttachmentTypeEnum;
import com.hb0730.boot.admin.configuration.properties.BootAdminProperties;
import com.hb0730.boot.admin.oss.handler.FileHandlers;
import com.hb0730.boot.admin.oss.model.UploadResult;
import com.hb0730.boot.admin.project.commons.service.ICommonService;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

/**
 * <p>
 * 通用service
 * </P>
 *
 * @author bing_huang
 * @since V1.0
 */
@Service
public class CommonServiceImpl implements ICommonService {
    private FileHandlers fileHandlers;
    private BootAdminProperties properties;

    public CommonServiceImpl(FileHandlers fileHandlers, BootAdminProperties properties) {
        this.fileHandlers = fileHandlers;
        this.properties = properties;
    }

    @Override
    public UploadResult upload(MultipartFile file) {
        AttachmentTypeEnum value = properties.getAttachmentType();
        return fileHandlers.upload(file, value);
    }
}
