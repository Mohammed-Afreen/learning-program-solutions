function BlogDetails({ blogs, show }) {
  
  return (
    <div className="v1">
      <h1>Blog Details</h1>
      {show ? (
        blogs.map((blog) => (
          <div key={blog.id}>
            <h4>{blog.title}</h4>
          </div>
        ))
      ) : (
        <p>No Blogs to Display</p>
      )}
    </div>
  );
}

export default BlogDetails;
