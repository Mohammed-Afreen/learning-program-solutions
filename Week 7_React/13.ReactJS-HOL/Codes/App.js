import './App.css';
import BookDetails from './components/BookDetails';
import BlogDetails from './components/BlogDetails';
import CourseDetails from './components/CourseDetails';

import { books, blogs, courses } from './data';

function App() {
  const showBlog = true;

  return (
    <center>
    <div className="container">
      <div className="section">
        <BookDetails books={books} />
      </div>

      <div className="vertical-divider"></div>

      <div className="section">
        <BlogDetails blogs={blogs} show={showBlog} />
      </div>

      <div className="vertical-divider"></div>

      <div className="section">
        <CourseDetails courses={courses} />
      </div>
    </div>
    </center>
  );
}

export default App;
