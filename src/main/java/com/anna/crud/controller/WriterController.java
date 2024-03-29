package com.anna.crud.controller;


import com.anna.crud.model.Post;
import com.anna.crud.model.Writer;
import com.anna.crud.repository.WriterRepository;
import com.anna.crud.repository.gson.GsonWriterRepositoryImpl;
import com.anna.crud.controller.WriterController;

import java.util.List;

    public class WriterController  {

        private final WriterRepository writerRepository = new GsonWriterRepositoryImpl();


        public Writer save(String name, List<Post> posts) {
            Writer writer = new Writer();
            writer.setPosts(posts);
            writer.setName(name);
            return writerRepository.save(writer);
        }

        public Writer update(Long id, String name, List<Post> posts) {
            Writer writer = new Writer();
            writer.setPosts(posts);
            writer.setName(name);
            writer.setId(id);
            return writerRepository.update(writer);
        }

        public Writer getById(Long id) {
            return writerRepository.getById(id);
        }

        public void deleteById(Long id) {
            writerRepository.deleteById(id);
        }

        public List<Writer> getAll() {
            return writerRepository.getAll();
        }
    }


